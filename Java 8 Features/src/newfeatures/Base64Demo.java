package newfeatures;

import java.util.Base64;
import java.util.Scanner;

public class Base64Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String userName,password;

System.out.println("Welcome to coforge ");
System.out.println("Enter name");
userName =sc.next();

System.out.println("Enter password");
password=sc.next();

//Encoding  the String to base 64
String encodePassword=Base64.getEncoder().encodeToString(password.getBytes());

System.out.println("User Name"+userName);
System.out.println("password"+encodePassword);

System.out.println("***********************Decode password***************");

//Base64 format to bytearray
String decodepassword=new String( Base64.getDecoder().decode(encodePassword));
System.out.println("The Password:"+decodepassword);
System.out.println("************************URL Encodeing************************");
Base64.Encoder encoder=Base64.getUrlEncoder();
String eUrl=encoder.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());
System.out.println("Encode URL:"+eUrl);


	}

}
