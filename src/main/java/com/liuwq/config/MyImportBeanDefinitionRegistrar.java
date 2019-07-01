package com.liuwq.config;

import com.liuwq.entity.PayEntity;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 手动注册bean
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(PayEntity.class);
        registry.registerBeanDefinition("payEntity", rootBeanDefinition);
    }
}
