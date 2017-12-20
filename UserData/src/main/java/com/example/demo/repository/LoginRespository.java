package com.example.demo.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.jpa.dao.IUserDataJPADAO;
import com.example.demo.model.UserAcctDetails;
import com.example.demo.resource.Login;
import com.example.demo.resource.LoginIdentity;

import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.ResourceList;

@Component
public class LoginRespository extends ResourceRepositoryBase<Login, Long> {
	@Autowired
	IUserDataJPADAO userDataJPADAO;
	
	public LoginRespository() {
		super(Login.class);
	}

	@Override
	public synchronized ResourceList<Login> findAll(QuerySpec querySpec) {
		List<UserAcctDetails> allUserAcctDetails = userDataJPADAO.getAllUserAcctDetails();
		
		List<Login> loginDetails = allUserAcctDetails.stream()
                .map(p -> new Login(new LoginIdentity(p.getUserAccountIdentity().getUserName(), p.getUserAccountIdentity().getAcctName()), p.getPassword()))
                .collect(Collectors.toList());
		
		return querySpec.apply(loginDetails);
	}
}