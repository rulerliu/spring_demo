package com.liuwq.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    /**
     * AnnotationMetadata 注解信息
     *
     * @param importingClassMetadata
     * @return
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 添加需要注册的spring容器的类
        return new String[]{"com.liuwq.entity.ImportSelectEntity"};
    }
}