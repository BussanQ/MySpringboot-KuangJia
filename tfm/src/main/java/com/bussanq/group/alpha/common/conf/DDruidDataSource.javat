package com.ehl.ece.situation.tfm.common.conf;

//@Configuration
//@MapperScan(basePackages = {"com.ehl.ece.situation.tfm.mapper"})
public class DDruidDataSource {
	/*@Bean("publicDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.ehlpublic")
	public DruidDataSource publicDataSource(DruidDataSource defaultDataSource) {
		DruidDataSource druidDataSource = defaultDataSource.cloneDruidDataSource();
		return druidDataSource;
	}

	@Bean("defaultDataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DruidDataSource defaultDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}

	@Bean
	@Primary
	public DynamicDataSource dataSource(DruidDataSource defaultDataSource,DruidDataSource publicDataSource) {
		Map<Object, Object> targetDataSources = new HashMap<>();
		targetDataSources.put("default",defaultDataSource);
		targetDataSources.put("public",publicDataSource);
		DynamicDataSource dataSource = new DynamicDataSource();
		dataSource.setTargetDataSources(targetDataSources);// 该方法是AbstractRoutingDataSource的方法
		dataSource.setDefaultTargetDataSource(defaultDataSource);// 默认的datasource设置为myTestDbDataSource
		dataSource.setTargetDataSources(targetDataSources);
		return dataSource;
	}

	@Bean(name = "defaultSqlSessionFactory")
	@Primary
	public SqlSessionFactory defaultSqlSessionFactory(DruidDataSource defaultDataSource, DruidDataSource publicDataSource) throws Exception {

		MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
		bean.setDataSource(this.dataSource(defaultDataSource,publicDataSource));
		return bean.getObject();
	}
*/
}
