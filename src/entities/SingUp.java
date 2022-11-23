package entities;

import java.util.Date;

import model.entities.User;

public class SingUp extends User{
	
	public SingUp(String name, long cpf, String password, Date birthDate) {
		super(name, cpf, password, birthDate);
	}

	@Override
	public String toString() {
		return "sing in sucessfully...\n\n"
				+ "Name: " + this.getName()
				+ "\nCpf: " + this.getCpf()
				+ "\nPassword: " + this.getPassword()
				+ "\nBirth Date: " + this.getBirthDate();
	}
}
