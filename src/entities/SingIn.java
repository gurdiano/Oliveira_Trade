package entities;
import model.entities.User;

public class SingIn extends User{

	public SingIn(long cpf, String password) {
		super();
		this.setCpf(cpf);
		this.setPassword(password);
	}
}
