/**
 * @author PRATHAMESH TIBILE
 * @since 30-6-21
 * User registration
 */
package Reg_Ex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		Firstname();
		Lastname();
		MailId();
		MobileNo();
	}  
	public static void Firstname()
	{
		 System.out.println("Enter First Name");
		 String name = sc.next();
		 System.out.println(Pattern.matches("[A-Z][a-z]{2,}",name));
	}
	public static void Lastname()
	{
		 System.out.println("Enter Last Name");
		 String lastname = sc.next();
		 System.out.println(Pattern.matches("[A-Z][a-z]{2,}",lastname));
	}
	public static void MailId()
	{
		 String Email ="abc.xyz@bl.co.in";
		 System.out.println(Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$",Email));
	}
	public static void MobileNo()
	{
		 System.out.println("Enter Mobile no:");
		 String mobileno = sc.next();
		 //number should start with code 91 and after that it shoul be start from 7,8 or9
		 System.out.println(Pattern.matches("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$",mobileno));
	}
	 
	 
}
