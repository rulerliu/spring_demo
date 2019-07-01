package com.liuwq.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {
    /**
     * 根据条件判断上下文context
     *
     * @param context
     * @param metadata
     * @return
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 1.获取当前环境配置
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        if ("Windows 7".equals(osName)) {
            // 返回true 就是能够创建该bean
            return true;
        }
        return false;
    }
}