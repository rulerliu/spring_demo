package com.liuwq.config;

import com.liuwq.entity.MemberEntity;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<MemberEntity> {

    @Override
    public MemberEntity getObject() {
        return new MemberEntity();
    }

    @Override
    public Class<?> getObjectType() {
        return MemberEntity.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}