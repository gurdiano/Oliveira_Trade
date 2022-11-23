package model.entities;

import java.util.Date;
import java.util.Objects;

public class User {
	
	private String name;
	private long cpf;
	private String password;
	private Date birthDate;
	
	public User() {
		
	}

	public User(String name, long cpf, String password, Date birthDate) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.password = password;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		User other = (User) obj;
		return cpf == other.cpf && Objects.equals(password, other.password);
	}
}
