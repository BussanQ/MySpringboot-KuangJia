package com.bussnaq.group.alpha.common.conf;

import com.jfinal.template.ext.spring.JFinalViewResolver;
import com.jfinal.template.source.ClassPathSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lizh
 * @date 2017/11/19
 */
@Configuration
public class EnjoyConfig {
	@Bean(name = "jfinalViewResolver")
	public JFinalViewResolver getJFinalViewResolver(){
		JFinalViewResolver jf = new JFinalViewResolver();
		jf.setDevMode(true);
		jf.setSourceFactory(new ClassPathSourceFactory());
//		jf.setPrefix("/cnbeta");
		jf.setSuffix(".html");
		jf.setContentType("text/html;charset=UTF-8");
		jf.setOrder(0);
		return jf;
	}
}
