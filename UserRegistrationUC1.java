/**
 * @author PRATHAMESH TIBILE
 * @since 30-6-21
 * User registration
 */
package Reg_Ex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC1
	{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	Firstname();
	}
	
	public static void Firstname()
	{
	 System.out.println("Enter First Name");
	 String name = sc.next();
	 System.out.println(Pattern.matches("[A-Z][a-z]{2,}",name));
	}
}
