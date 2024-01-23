package shopManagment1;

import java.io.Serializable;

public class UserDetails implements Serializable{

	String userName;  
	String password;
	String roll;
	
	public UserDetails(String userName,String password,String roll)
	{
		this.userName=userName;
		this.password=password;
		this.roll=roll;
	}
	public UserDetails() {
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	

}
