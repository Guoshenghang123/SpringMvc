package com.guosh.annotation;

import java.lang.annotation.*;

/**
 * Created by guosh on 2018/6/22.
 */
@Target({ElementType.TYPE, ElementType.METHOD})//作用在类上和方法上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {
    /**
     * 表示访问该方法的url
     * @return
     */
    String value() default "";

}
