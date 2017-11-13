package com.ehl.ece.situation.tfm.common.db;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于Service和Dao层切换数据
 *
 * @author lizh
 * @date 2017-4-18
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataBase {
    String value() default "default";
}