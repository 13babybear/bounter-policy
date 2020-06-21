package cn.bounter.policy.annotation;

import cn.bounter.policy.enums.ClientEnum;

import java.lang.annotation.*;

/**
 * 客户标记注解，用于标识客户身份
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ClientTag {

    ClientEnum value() default ClientEnum.SIMON;
}
