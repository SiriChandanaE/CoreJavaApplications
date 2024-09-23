package com.evergent.coreJAVA.OOPS;

public class UserLogin {
	public void LoginData() {
		System.out.println("LoginData");
	}
	
	public void LoginData(String UName, String pass) {
		System.out.println("UName: "+UName);
		System.out.println("Pass: "+pass);
	}
	
	public void LoginData(String UName, String pass, String Capcha) {
		System.out.println("UName: "+UName);
		System.out.println("Pass: "+pass);
		System.out.println("Capcha: "+Capcha);
	}

	public void LoginData(int Mobile, String pass) {
		System.out.println("Mobile: "+Mobile);
		System.out.println("Pass: "+pass);
	}
	

	public static void main(String[] args) {
		UserLogin ul= new UserLogin();
		ul.LoginData();
		ul.LoginData("Siri", "Siri123");
		ul.LoginData("Siri", "Siri123", "ESC");
		ul.LoginData(123, "Siri123");

	}

}
