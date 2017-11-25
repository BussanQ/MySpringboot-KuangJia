package com.ehl.ece.situation.tfm.common.conf;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.ehl.ece.situation.tfm.mapper"}, sqlSessionTemplateRef = "defaultSqlSessionTemplate")
public class DefaultDruidDataSource {

	@Bean("defaultDataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DruidDataSource defaultDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}

	@Bean(name = "defaultSqlSessionFactory")
	@Primary
	public SqlSessionFactory defaultSqlSessionFactory(@Qualifier("defaultDataSource") DataSource dataSource) throws Exception {
		MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		//bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/PublicMapper*.xml"));
		return bean.getObject();
	}

	@Bean(name = "defaultTransactionManager")
	@Primary
	public DataSourceTransactionManager defaultTransactionManager(@Qualifier("defaultDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "defaultSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate defaultSqlSessionTemplate(@Qualifier("defaultSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
