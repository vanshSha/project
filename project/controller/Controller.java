package project.controller;

import project.pojo.User;
import project.service.Service;
import project.service.UserServiceImpl;

public class Controller {

	public static void main(String[] args) {
		Service service = new UserServiceImpl();

		User vansh = service.create(101, " Vansh ");
		User himanshu = service.create(103, "Himanshu");
		//service.display(vansh);
		vansh = service.updateUser(vansh,himanshu);
			service.display(vansh);
	}
}
