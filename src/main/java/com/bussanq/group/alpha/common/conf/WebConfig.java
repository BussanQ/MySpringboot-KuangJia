package com.bussanq.group.alpha.common.conf;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.jfinal.template.ext.spring.JFinalViewResolver;
import com.jfinal.template.source.ClassPathSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizh
 * @date 2017/11/20
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//将所有/static/** 访问都映射到classpath:/static/ 目录下
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}

	/**
	 * json配置
	 * @param converters
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(
				SerializerFeature.PrettyFormat
		);
		fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
		fastConverter.setFastJsonConfig(fastJsonConfig);
		//处理中文乱码问题
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		fastConverter.setSupportedMediaTypes(fastMediaTypes);
		converters.add(fastConverter);
	}

	/**
	 * enjoy模板引擎配置
	 * @return
	 */
	@Bean(name = "jfinalViewResolver")
	public JFinalViewResolver getJFinalViewResolver(){
		JFinalViewResolver jf = new JFinalViewResolver();
		jf.setDevMode(true);
		jf.setSourceFactory(new ClassPathSourceFactory());
		jf.setPrefix("/templates");
		jf.setSuffix(".html");
		jf.setContentType("text/html;charset=UTF-8");
		jf.setOrder(0);
		return jf;
	}
}
