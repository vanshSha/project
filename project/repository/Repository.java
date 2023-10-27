package project.repository;

import project.pojo.User;

public class Repository {

	public User create(int id, String name) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		return user;
	}
	
	public void display(User user) {
		System.out.println(user.getId()+""+user.getName());
	}
	
	public User updateUser(User existingUser,User newUser) {
		existingUser.setId(newUser.getId());
		existingUser.setName(newUser.getName());
		return existingUser;
	}
	
	public void delete(User user) {
		user = null;
	}
}
