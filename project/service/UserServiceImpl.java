package project.service;

import project.pojo.User;
import project.repository.Repository;

public class UserServiceImpl extends Service {

	private Repository repository = new Repository();

	public User create(int id, String name) {
		User user = repository.create(id, name);
		return user;
	}

	public void display(User user) {
		repository.display(user);
	}

	public User updateUser(User existingUser, User newUser) {
		return repository.updateUser(existingUser, newUser);
	}

	public void delete(User user) {
		user = null;
	}
}
