package com.ehl.ece.situation.tfm.common.db;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 数据源切面，切换数据库
 *
 * @author lizh
 * @date 2017-4-18
 */
@Aspect
@Component
public class DataSourceAspect {
    static final Logger logger = Logger.getLogger(DataSourceAspect.class);

    /*@Before("within(com.ehl.ece.situation.tfm.mapper..*) && @annotation(dataBase)")
    public void addBeforeMapper(JoinPoint joinPoint, DataBase dataBase) {
        logger.info("执行数据库切换开始");
        DataSourceHolder.setDbType(dataBase.value());
    }
*/
	/**
     * 拦截目标方法，获取由@DataSource指定的数据源标识，设置到线程存储中以便切换数据源
     * 
     * @param point
     * @throws Exception
     */
    //@Before("execution(* com.ehl.ece.situation.tfm.mapper.*.*(..))")
    public void intercept(JoinPoint point) throws Exception {
        Class<?> target = point.getTarget().getClass();
        MethodSignature signature = (MethodSignature) point.getSignature();
        // 默认使用目标类型的注解，如果没有则使用其实现接口的注解
        for (Class<?> clazz : target.getInterfaces()) {
            resolveDataSource(clazz, signature.getMethod());
        }
        resolveDataSource(target, signature.getMethod());
    }

    /**
     * 提取目标对象方法注解和类型注解中的数据源标识
     * 
     * @param clazz
     * @param method
     */
    private void resolveDataSource(Class<?> clazz, Method method) {
        try {
            logger.info("执行数据库切换开始");
            Class<?>[] types = method.getParameterTypes();
            // 默认使用类型注解
            if (clazz.isAnnotationPresent(DataBase.class)) {
            	DataBase source = clazz.getAnnotation(DataBase.class);
                DataSourceHolder.setDbType(source.value());
            }
            // 方法注解可以覆盖类型注解
            Method m = clazz.getMethod(method.getName(), types);
            if (m != null && m.isAnnotationPresent(DataBase.class)) {
            	DataBase source = m.getAnnotation(DataBase.class);
            	DataSourceHolder.setDbType(source.value());
            }
        } catch (Exception e) {
            logger.error("异常",e);
        }
    }

}