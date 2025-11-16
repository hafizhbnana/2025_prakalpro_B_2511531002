package pekan7_2511531002;

public class Akun {
	private int pinAngka;
	private String username, password, email;
	
	public void setPin(int pinAngka) {
		this.pinAngka = pinAngka;
	}
	public void setUser(String username) {
		this.username = username;
	}
	public void setPass(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isPasswordValid() {
		if (password == null) return false;
		return password.length() >= 8;
	}
	
	public boolean isEmailValid() {
		if (email == null) return false;
		return email.contains("@") && email.contains(".");
	}
	
	public int getPin() {
		return pinAngka;
	}
	public String getUser() {
		return username;
	}
	public String getPass() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	
	public static void main(String[] args) {
		
	}
}
