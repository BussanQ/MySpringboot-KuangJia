package com.bussnaq.group.alpha.common.util;

import okhttp3.FormBody;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * okhttp3 工具类
 * @author lizh
 * @date 2017/10/27
 */
public class OkHttpUtils {

	private OkHttpUtils() {
	}

	private static final okhttp3.OkHttpClient httpClient;

	static {
		// 分别设置Http的连接,写入,读取的超时时间
		httpClient = new okhttp3.OkHttpClient().newBuilder()
				.connectTimeout(10, TimeUnit.SECONDS)
				.writeTimeout(10, TimeUnit.SECONDS)
				.readTimeout(30, TimeUnit.SECONDS)
				.build();
	}

	private static final okhttp3.MediaType CONTENT_TYPE_FORM =
			okhttp3.MediaType.parse("application/x-www-form-urlencoded");

	private static String exec(okhttp3.Request request) {
		try {
			okhttp3.Response response = httpClient.newCall(request).execute();
			if (!response.isSuccessful()) throw new RuntimeException("Unexpected code " + response);
			return response.body().string();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String get(String url) {
		okhttp3.Request request = new okhttp3.Request.Builder().url(url).get().build();
		return exec(request);
	}

	public static String get(String url, Map<String, String> queryParas) {
		okhttp3.HttpUrl.Builder urlBuilder = okhttp3.HttpUrl.parse(url).newBuilder();
		for (Map.Entry<String, String> entry : queryParas.entrySet()) {
			urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
		}
		okhttp3.HttpUrl httpUrl = urlBuilder.build();
		okhttp3.Request request = new okhttp3.Request.Builder().url(httpUrl).get().build();
		return exec(request);
	}

	public static String post(String url, String params) {
		okhttp3.RequestBody body = okhttp3.RequestBody.create(CONTENT_TYPE_FORM, params);
		okhttp3.Request request = new okhttp3.Request.Builder()
				.url(url)
				.post(body)
				.build();
		return exec(request);
	}

	public static String post(String url, Map<String, String> paras) {
		FormBody.Builder builder = new FormBody.Builder();
		for(Map.Entry<String,String> entry : paras.entrySet()){
			builder.add(entry.getKey(),entry.getValue());
		}
		okhttp3.Request request = new okhttp3.Request.Builder()
				.url(url)
				.post(builder.build())
				.build();
		return exec(request);
	}

	public static String postSSL(String url, String data, String certPath, String certPass) {
		okhttp3.RequestBody body = okhttp3.RequestBody.create(CONTENT_TYPE_FORM, data);
		okhttp3.Request request = new okhttp3.Request.Builder()
				.url(url)
				.post(body)
				.build();
		InputStream inputStream = null;
		try {
			KeyStore clientStore = KeyStore.getInstance("PKCS12");
			inputStream = new FileInputStream(certPath);
			char[] passArray = certPass.toCharArray();
			clientStore.load(inputStream, passArray);

			KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
			kmf.init(clientStore, passArray);
			KeyManager[] kms = kmf.getKeyManagers();
			SSLContext sslContext = SSLContext.getInstance("TLSv1");
			sslContext.init(kms, null, new SecureRandom());
			okhttp3.OkHttpClient httpsClient = new okhttp3.OkHttpClient()
					.newBuilder()
					.connectTimeout(10, TimeUnit.SECONDS)
					.writeTimeout(10, TimeUnit.SECONDS)
					.readTimeout(30, TimeUnit.SECONDS)
					.sslSocketFactory(sslContext.getSocketFactory())
					.build();
			okhttp3.Response response = httpsClient.newCall(request).execute();
			if (!response.isSuccessful()) throw new RuntimeException("Unexpected code " + response);
			return response.body().string();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException ioe) {
				// ignore
			}
		}
	}

	public static InputStream download(String url, String params) {
		okhttp3.Request request;
		if (StrUtils.notBlank(params)) {
			okhttp3.RequestBody body = okhttp3.RequestBody.create(CONTENT_TYPE_FORM, params);
			request = new okhttp3.Request.Builder().url(url).post(body).build();
		} else {
			request = new okhttp3.Request.Builder().url(url).get().build();
		}
		try {
			okhttp3.Response response = httpClient.newCall(request).execute();
			if (!response.isSuccessful()) throw new RuntimeException("Unexpected code " + response);
			return response.body().byteStream();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String upload(String url, File file, String params) {
		okhttp3.RequestBody fileBody = okhttp3.RequestBody
				.create(okhttp3.MediaType.parse("application/octet-stream"), file);
		okhttp3.MultipartBody.Builder builder = new okhttp3.MultipartBody.Builder()
				.setType(okhttp3.MultipartBody.FORM)
				.addFormDataPart("media", file.getName(), fileBody);
		if (StrUtils.notBlank(params)) {
			builder.addFormDataPart("description", params);
		}
		okhttp3.RequestBody requestBody = builder.build();
		okhttp3.Request request = new okhttp3.Request.Builder()
				.url(url)
				.post(requestBody)
				.build();
		return exec(request);
	}
}

