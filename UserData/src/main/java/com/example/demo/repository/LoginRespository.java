package com.example.demo.repository;

import org.springframework.stereotype.Component;

import com.example.demo.resource.Login;

import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.ResourceList;

@Component
public class LoginRespository extends ResourceRepositoryBase<Login, Long> {

	public LoginRespository() {
		super(Login.class);
	}

	@Override
	public synchronized ResourceList<Login> findAll(QuerySpec querySpec) {
		 return querySpec.apply(null);
	}
}