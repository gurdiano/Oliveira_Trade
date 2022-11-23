package entities;
import java.util.Date;
import java.util.List;

import model.entities.User;
import model.entities.UserException;

public class Login {
	
	private List<User> users;
	
	public Login(List<User> users) {
		this.users = users;
	}
	
	public User singUp(String name, long cpf, String password, Date birthDate) {
		
		User user = search(cpf);
		
		if(user != null) throw new UserException("the cpf " + cpf + "already used by other account");
		
		user = new SingUp(name, cpf, password, birthDate);
		users.add(user);
		
		return user;
	}
	
	
	public  User singIn(long cpf, String password) {
		User obj = new SingIn(cpf, password);
		User user = search(cpf);
		if(user == null) throw new UserException(cpf + " not found!");
		
		if(!user.equals(obj)) {
			throw new UserException("cpf or password is incorrect");
		}
		return user;
	}
	
	private User search(long cpf) {
		for(User u : users) {
			if(u.getCpf() == cpf) {
				return u;
			}
		}
		return null;
	}
}	
