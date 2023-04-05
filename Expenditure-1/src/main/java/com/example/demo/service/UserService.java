package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public interface UserService {

	public User saveData(User user);

	public List getData();

	public void deleteData(int id);

	
	public User updateData(int id, User user);

	 
	

	

}
