import java.util.Scanner;

 

public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
						Scanner sc = new Scanner(System.in);
						System.out.println("enter the number");
// /Thisi  si scommnet changees by ayuhs
	       
	       int input=sc.nextInt();
						int rem,temp,num=0;
						temp=input;
						while(input>0)
						{
						rem = input%10;
						input=input/10;
						num = (num*10) + rem;

						}
						if(temp==num)
						{
						System.out.println("number isa palindrom");
						}else{
						System.out.println("number is not palindrom");
						}

      }

 

            //function to printPattern

       public void printPattern() {
					Scanner sc =new Scanner(System.in);
					System.out.println("enter the number");
					int num=sc.nextInt();
					int i,j;
					for(i=1;i<=num;i++)
					{
					for(j=0;j<=num-i;j++)
					{
					if(j<=num-i)
					{
					System.out.print("*");
					}
					else
					{
					System.out.println(" ");
					}
					}
					System.out.println(" \n ");
					}

      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the number");
						int num=sc.nextInt();
						int flag=0;
						if(num==0||num==1)
						{
						System.out.println("not prime");

						}
						else{
						for(int i=2;i<=num-1;i++)
						{
						if(num%i==0)
						{
						System.out.println(" not  prime");
						flag=1;
						break;
						}
						}
						if(flag==0)
						{
						System.out.println(" is prime");
						}





						}

        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

     						int first=0,second=1,third;
						Scanner sc =new Scanner(System.in);
						System.out.println("enter the number");
						int num=sc.nextInt();
						if(num == 1)
						{
						System.out.println("0");
						}
						else if(num==2)
						{
						System.out.println("0"+",1");
						}
						else if(num>2)
						{
						System.out.print("0");
						System.out.print("1");
						for(int i=0;i<=num;i++)
						{
						third = first + second;
						first = second;
						second =third;
						System.out.print(third);
						}

						}

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
