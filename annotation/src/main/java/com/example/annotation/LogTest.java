package com.example.annotation;

/**
 * Created by ZTH on 2018/1/20.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ZTH on 2018/1/19.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface LogTest {
}
