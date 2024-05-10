package userServiceApi.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import userServiceApi.Entity.User;
import userServiceApi.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = this.userService.getUser(userId);
		System.out.println("The user is: "+user.getUserId());
//		List contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/" + user.getUserId(), List.class);
//		user.setContacts(contacts);
		return user;
	}
}
