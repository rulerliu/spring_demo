package com.liuwq.config;

import com.liuwq.annotation.EnableImportSelector;
import com.liuwq.entity.ImportEntity;
import com.liuwq.entity.UserEntity;
import com.liuwq.entity.Win7Entity;
import org.springframework.context.annotation.*;

// @Configuration 等同于配置的spring配置文件
@Configuration
@ComponentScan(basePackages = "com.liuwq")
//@ComponentScan(basePackages = "com.liuwq", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class)}, useDefaultFilters = false)
//@ComponentScan(basePackages = "com.liuwq", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class)}, useDefaultFilters = true)
@Import(value = {ImportEntity.class, MyImportBeanDefinitionRegistrar.class})
@EnableImportSelector
public class MySpringConfig {

    /**
     * 注入beanId是方法名
     * scope默认是singleton，@Lazy默认是true，不加的话是false，当scope为prototype时，一直是懒加载
     * @return
     */
    @Bean
    @Scope("singleton")
    @Lazy(false)
    public UserEntity userEntity() {
        return new UserEntity(20, "mayikt");
    }

    @Bean
    @Conditional(MyCondition.class)
    public Win7Entity win7Entity() {
        return new Win7Entity();
    }

    @Bean
    public MyFactoryBean myFactoryBean() {
        return new MyFactoryBean();
    }
}
