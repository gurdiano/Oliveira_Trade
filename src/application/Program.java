package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import entities.Login;
import model.entities.User;
import model.entities.UserException;


public class Program {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		List<User> users = new ArrayList<>();
		
		
		Login getConnection = new Login(users);
		
		while(true) {
			try {
				String name, password;
				long cpf;
				Date birthdate = new Date();
				
				System.out.println("-------------------------------");
				System.out.println("\n\n");
				System.out.println("Sing in ---> enter 0" );
				System.out.println("Sing up ---> enter 1" );
				System.out.print("key: ");
				
				int answer = sc.nextInt();
				
				System.out.println();
				
				if(answer == 0) {
					System.out.print("cpf: " );
					cpf = sc.nextLong();
					System.out.print("password: " );
					password = sc.next();
					System.out.println(getConnection.singIn(cpf, password));
				}else if(answer == 1) {
					
					System.out.print("Name:");
					sc.nextLine();
					name = sc.nextLine();
					System.out.print("Cpf: " );
					cpf = sc.nextLong();
					System.out.print("Password: " );
					password = sc.next();
					getConnection.singUp(name, cpf, password, birthdate);
					System.out.println("Sign up success");
				}else {
					throw new UserException("Unexpected number");
				}
			}catch(UserException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}




