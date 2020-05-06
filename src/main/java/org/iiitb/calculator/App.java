package org.iiitb.calculator;

import java.util.Scanner;

public class App 
{
    public static int add(int a,int b) { return (a+b); }
    public static int diff(int a,int b)
    {
        return (a-b);
    }
    public static int product(int a,int b)
    {
        return (a*b);
    }
    public static int divide(int a,int b)
    {
        return (a/b);
    }
    public static void main(String[] args)
    {
        int num1,num2,choice,ans;

        Scanner sc=new Scanner(System.in);

        while(true) {

            System.out.println("Enter 1 for Addition\n, 2 for Subtraction\n, 3 for Multiplication\n, 4 for division and 5 to exit\n");

            choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter the first number:");
                    num1=sc.nextInt();
                    System.out.println("Enter the second number:");
                    num2=sc.nextInt();
                    ans=add(num1,num2);
                    System.out.println("Addition: "+ans);
                    break;

                case 2:
                    System.out.println("Enter the first number: ");
                    num1=sc.nextInt();
                    System.out.println("Enter the second number: ");
                    num2=sc.nextInt();
                    ans=diff(num1,num2);
                    System.out.println("Difference: "+ans);
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    num1=sc.nextInt();
                    System.out.println("Enter the second number: ");
                    num2=sc.nextInt();
                    ans=product(num1,num2);
                    System.out.println("Product: "+ans);
                    break;
                case 4:
                    System.out.println("Enter the first number: ");
                    num1=sc.nextInt();
                    System.out.println("Enter the second number: ");
                    num2=sc.nextInt();
                    ans=divide(num1,num2);
                    System.out.println("Division: "+ans);
                    break;
                case 5:
                    System.out.println("Bye!");
                    System.exit(0);break;
                default:System.out.println("Enter a valid choice!\n");
            }

        }


    }
}
