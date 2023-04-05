package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository repository;

@Override
public User saveData(User user) {
	
	return repository.save(user);
}


public List getData() {
	
	return repository.findAll();
}


@Override
public void deleteData(int id) {
	repository.deleteById(id);
	
}





@Override
public User updateData(int id, User user) {
	User use= repository.findById(id).get();
//	if(Objects.nonNull(user.getAmount()) && !"".equalsIgnoreCase(user.getAmount())) {
//		use.setAmount(user.getAmount());
//	}
//	if(Objects.nonNull(user.getItem()) && !"".equalsIgnoreCase(user.getItem())) {
//		use.setItem(user.getItem());
//	}
//	return repository.save(use);
//	
	
//	if (StringUtils.isNotBlank(user.getAmount())) {
//        use.setAmount(user.getAmount());
//    }
//    if (StringUtils.isNotBlank(user.getItem())) {
//        use.setItem(user.getItem());
//    }
//    return repository.save(use);
	
//	if (user.getAmount() != null && !user.getAmount().trim().isEmpty()) {
//        use.setAmount(user.getAmount());
//	if (amount != null && !String.valueOf(amount).trim().isEmpty()) {
//	    use.setAmount(amount);
	    
    
	Integer amount = user.getAmount();
	if (amount != null && amount.toString().replaceAll("\\s", "").length() > 0) {
	    use.setAmount(amount);
    if (user.getItem() != null && !user.getItem().trim().isEmpty()) {
        use.setItem(user.getItem());
    }
    
}
	return repository.save(use);
}
}




	




