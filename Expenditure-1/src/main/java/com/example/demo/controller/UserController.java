package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
@Autowired
private UserService service;
@PostMapping("post")
public User saveData(@RequestBody User user){
	
	return service.saveData(user);
	
}
@GetMapping("get")
public List getData() {
	return service.getData();
}
@DeleteMapping("delete/{id}")

public String deleteData(@PathVariable("id") int id) {
	service.deleteData(id);
	return "deleted successfully";
}
@PutMapping("put/{id}")

public User updateData(@PathVariable("id") int id,@RequestBody User user) {
	return service.updateData(id,user);
	 
}
}
