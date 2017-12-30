package com.etcxm._07Created._04;

import org.springframework.beans.factory.FactoryBean;

public class SomeBean4FactoryBean implements FactoryBean<SomeBean4> {

	@Override
	public SomeBean4 getObject() throws Exception {
		// TODO Auto-generated method stub
		return new SomeBean4();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return SomeBean4.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
