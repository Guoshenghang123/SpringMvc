package com.guosh.annotation;

import java.lang.annotation.*;

/**
 * Created by guosh on 2018/6/22.
 */

@Target(ElementType.TYPE)//作用在类上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
    /**
     * 表示给controller注册别名
     * @return
     */
    String value() default "";
}
