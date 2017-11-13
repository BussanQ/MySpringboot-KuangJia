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
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.ehl.ece.situation.tfm.publicMapper"}, sqlSessionTemplateRef = "publicSqlSessionTemplate")
public class PublicDruidDataSource {

	/*@Bean("publicDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.ehlpublic")
	public DataSource druidDataSource() {
		DataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}*/

	@Bean("publicDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.ehlpublic")
	public DruidDataSource publicDataSource(DruidDataSource defaultDataSource) {
		DruidDataSource druidDataSource = defaultDataSource.cloneDruidDataSource();
		return druidDataSource;
	}

	@Bean(name = "publicSqlSessionFactory")
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("publicDataSource") DataSource dataSource) throws Exception {
		MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		// bean.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));// 指定基包
		//bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/PublicMapper*.xml"));
		return bean.getObject();
	}

	@Bean(name = "publicTransactionManager")
	public DataSourceTransactionManager testTransactionManager(@Qualifier("publicDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "publicSqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("publicSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
