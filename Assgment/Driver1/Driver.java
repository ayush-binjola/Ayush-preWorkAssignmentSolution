package com.Driver;
import java.util.Scanner;
import com.Employee.*;
import com.mailPass.*;
public class Driver {
public static  void main(String []args)
{
	genMailPass  mp=new genMailPass();
	Employee emp=new Employee("Ayush","B");
	System.out.println("Enter the choice");
	System.out.println("1. Technical" + "\n" + "2. Admin" + "\n" + "3. Human reasource" + "\n" + "4. Leagal");
	String email="";
	Scanner sc =new Scanner(System.in);
	int i =sc.nextInt();
	switch(i)
	{
	case 1:
		System.out.println("Hi " +emp.firstName+ "Your Email and pASs is.. \n Email->>"+mp.genEmail(emp,"tech")+"\n"+"password-->>"+mp.genPass() );
		break;
	case 2:
		System.out.println("Hi " +emp.firstName+ "Your Email and pASs is.. \n Email->>"+mp.genEmail(emp,"admin")+"\n"+"password-->>"+mp.genPass() );
		break;
	case 3:
		System.out.println("Hi " +emp.firstName+ "Your Email and pASs is.. \n Email->>"+mp.genEmail(emp,"humanrs")+"\n"+"password-->>"+mp.genPass() );
		break;
	case 4:
		System.out.println("Hi " +emp.firstName+ "Your Email and pASs is.. \n Email->>"+mp.genEmail(emp,"legal")+"\n"+"password-->>"+mp.genPass() );
		break;	
	default:
		System.out.println("You chossed wrong");
	}
}
}
