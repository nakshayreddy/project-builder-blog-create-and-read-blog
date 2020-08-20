package model;

import java.time.LocalDate;

public class User{
	private String email;
    private String password;
    LocalDate Date;
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String email, String password, LocalDate date) {
		super();
		this.email = email;
		this.password = password;
		Date = date;
	}
	public User(String email2, String password2) {
		// TODO Auto-generated constructor stub
		this.email = email;
		this.password = password;
	}
	
	
    
    
	
}

