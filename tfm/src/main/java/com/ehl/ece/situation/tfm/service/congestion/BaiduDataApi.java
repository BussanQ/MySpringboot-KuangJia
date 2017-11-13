package com.ehl.ece.situation.tfm.service.congestion;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ehl.ece.situation.tfm.bean.CityCongestion;
import com.ehl.ece.situation.tfm.bean.RoadAlarm;
import com.ehl.ece.situation.tfm.bean.RoadRank;
import com.ehl.ece.situation.tfm.common.util.OkHttpUtils;
import com.ehl.ece.situation.tfm.common.util.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 百度拥堵数据
 * @author lizh
 * @date 2017/10/27
 */
@Component
public class BaiduDataApi {
	static final Logger logger = Logger.getLogger(BaiduDataApi.class);

	private final String CITY_CONGESTION_URL =
			"http://jiaotong.baidu.com/openapi/v1/city/roadboard?ak={0}&cityCode={1}&districtType={2}&roadType={3}";

	private final String ROAD_RANK_URL =
			"http://jiaotong.baidu.com/openapi/v1/city/roadrank?ak={0}&cityCode={1}&districtType={2}&roadType={3}";
	private final String ROAD_ALARM_URL =
			"http://jiaotong.baidu.com/openapi/v1/city/roadalarm?ak={0}&cityCode={1}&districtType={2}&roadType={3}";
	private final String ROAD_ALARMDETAIL_URL =
			"http://jiaotong.baidu.com/openapi/v1/city/roadalarmdetail?ak={0}&cityCode={1}&districtType={2}&roadType={3}&alarmNum={4}";

	private final String DISTRICT_RANK_URL =
			"http://jiaotong.baidu.com/openapi/v1/city/admindistrictrank?ak={0}&cityCode={1}&roadType={2}";

	private final String PLAZA_RANK_URL =
			"http://jiaotong.baidu.com/openapi/v1/city/trafficdistrictrank?ak={0}&cityCode={1}&roadType={2}";
	private final String BAIDU_AK = "26b23785ab2b0bd9d6b8838a300065b9";
	private final String CITY_CODE = "288";
	private final String DISTRICT_TYPE = "0";
	private final String ROAD_TYPE = "0";

	/**
	 * 获取城市实时拥堵数据
	 */
	public List<CityCongestion> getCityCongestion(){
		String url = MessageFormat.format(CITY_CONGESTION_URL, BAIDU_AK, CITY_CODE, DISTRICT_TYPE, ROAD_TYPE);
		List<CityCongestion> list = getBaiduDataList(url,CityCongestion.class);
		if (list != null)
			return list;
		else
			logger.error("===============城市实时拥堵数据获取失败");
		return new ArrayList<>();
	}

	/**
	 * 获取城市道路拥堵排行数据
	 */
	public List<RoadRank> getRoadRank(){
		String url = MessageFormat.format(ROAD_RANK_URL, BAIDU_AK, CITY_CODE, DISTRICT_TYPE, ROAD_TYPE);
		List<RoadRank> list = getBaiduDataList(url,RoadRank.class);
		if (list != null)
			return list;
		else
			logger.error("===============城市道路拥堵排行数据获取失败");
		return new ArrayList<>();
	}

	/**
	 * 获取城市道路拥堵排行数据
	 */
	public String getRoadRankStr(){
		String url = MessageFormat.format(ROAD_RANK_URL, BAIDU_AK, CITY_CODE, DISTRICT_TYPE, ROAD_TYPE);
		return GetList(url);
	}


	/**
	 * 获取城市道路拥堵排行数据
	 */
	public List<RoadAlarm> getRoadAlarm(){
		String url = MessageFormat.format(ROAD_ALARM_URL, BAIDU_AK, CITY_CODE, DISTRICT_TYPE, ROAD_TYPE);
		List<RoadAlarm> list = getBaiduDataList(url,RoadAlarm.class);
		if (list != null)
			return list;
		else
			logger.error("===============异常拥堵数据获取失败");
		return new ArrayList<>();
	}

	/**
	 * 获取城市道路拥堵排行数据
	 */
	public String getRoadAlarmDetail(String alarmNum){
		String url = MessageFormat.format(ROAD_ALARMDETAIL_URL, BAIDU_AK, CITY_CODE, DISTRICT_TYPE,ROAD_TYPE,alarmNum);
		return GetList(url);
	}

	/**
	 * 获取数据对象列表
	 */
	public <T>List<T> getBaiduDataList(String url,Class<T> clazz){
		String data = GetList(url);
		if (data != null) {
			try {
				List<T> list = JSON.parseArray(data,clazz);
				return list;
			}
			catch (Exception ex) {
				logger.error("转换数据对象出错"+clazz.toString(),ex);
			}
		}
		return null;
	}

	/**
	 * 访问百度拥堵数据http接口，获取json数据
	 * @param url
	 * @return
	 */
	private String GetList(String url) {
		try {
			String result =  OkHttpUtils.get(url);
			if (StrUtils.notBlank(result)) {
				JSONObject json = JSON.parseObject(result);
				if (json.getString("status").equals("0")) {
					String jsonArray = json.getJSONObject("result").getString("list");
					return jsonArray;
				}
			}
		}
		catch (Exception ex) {
			logger.error("访问http接口出错",ex);
		}
		return null;
	}
}
