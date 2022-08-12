package com.movieapp.service;

import java.util.stream.Stream;

public class LoginServiceImpl implements ILoginService {
	String[] userName= {"Samreen","Hema","Rahul","Divya","Sarah"};
	
	@Override
	public boolean validateUsername(String username,String password) {
		return Stream.of(userName).filter(str->str.equals(username) && password.equals("Admin@123")).findAny().isPresent();
		
		
		
		
	}
	
	

}
