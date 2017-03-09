package coats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coats.model.User;
import coats.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
    UserRepository userRepository;
	
	 @RequestMapping(value = "/users",method = RequestMethod.GET)
	 public List<User> usersList(){
	        List<User> users = (List<User>) userRepository.findAll();
	        return users;
	    }
	 
	 @RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	    
	    public long saveProduct(@RequestBody User user) {
	        userRepository.save(user);
	        return user.getId();
	    }
	 
}
