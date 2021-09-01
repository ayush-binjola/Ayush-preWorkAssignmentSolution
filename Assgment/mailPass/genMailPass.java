package com.mailPass;
import java.util.Random;

import com.Employee.*;
public class genMailPass {
String company="mycomp";

	public String genEmail(Employee emp,String dept)
	{
		return emp.getFirstName()+emp.getLastName()+"@"+dept+"."+company+".com";
		
	}
	 public char[] genPass()
	{
		String upper="QWERTYUIOPASDFGHJKLZXCVBNM";
		String lower="qwertyuiopasdfghjklzxcvbnm";
		String special="!@#$%^&*()_+";
		String num ="0987654321";
		String all=upper+lower+special+num;
	Random rnd = new Random();
		int len = 8;
		char[] newArr=new char[9];
		for (int i=0;i<len;i++)
		{
			newArr[i]=all.charAt(rnd.nextInt(all.length()));
			
		}
		return newArr;
	}
}
