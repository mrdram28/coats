package coats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coats.dao.UserDao;
import coats.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	 @RequestMapping(value = "/users",method = RequestMethod.GET)
	 public List<User> usersList(){
	        List<User> users = (List<User>) userDao.getAll();
	        return users;
	    }
	 
	 @RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	    
	    public long saveProduct(@RequestBody User user) {
		 	userDao.create(user);
	        return user.getId();
	    }
	 
}
