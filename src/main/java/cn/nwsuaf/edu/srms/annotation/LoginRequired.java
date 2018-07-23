package cn.nwsuaf.edu.srms.annotation;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/22
 * Time: 17:19
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {
}
