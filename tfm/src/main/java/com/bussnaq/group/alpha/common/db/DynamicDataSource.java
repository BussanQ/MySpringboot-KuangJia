package com.bussnaq.group.alpha.common.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源配置
 * 
 * @author lizh
 * @date 2017-4-18
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	/**
	 * 继承实现,获取动态数据源标识
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceHolder.getDbType();
	}
}
