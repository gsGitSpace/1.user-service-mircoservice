package userServiceApi.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import userServiceApi.Entity.User;

@Service
public class UserServiceImpl implements UserService {
	List<User> list = Arrays.asList(
			new User(1311L, "Durgesh Tiwari", "2345754"),
			new User(1312L, "Ankit Tiwari", "4445554"),
			new User(1314L, "Ravi Tiwari", "76545655")
			);

	@Override
	public User getUser(Long id) {
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}
}
