package project.service;

import project.pojo.User;

public abstract class Service {
	
	public abstract User create(int id ,String name);
	public abstract void display(User user);
	public abstract User updateUser(User existingUser,User newUser);
	public abstract void delete(User user);
}
