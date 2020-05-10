package org.iiitb.calculator;


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
    public static double divide(int a, int b) {
        double result;
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = Double.valueOf(a)/Double.valueOf(b);
        }
        return result;
    }
    public static void main(String[] args)
    {       if(args.length == 0){
                while (true);
            }
            int num1,num2,choice,ans;

            System.out.println("\nEnter:\n 1 for Addition\n 2 for Subtraction:\n 3 for Multiplication\n 4 for division and 5 to exit\n");

            choice=Integer.valueOf(args[2]);

            switch (choice)
            {
                case 1:
                    num1=Integer.valueOf(args[0]);
                    num2=Integer.valueOf(args[1]);
                    ans=add(num1,num2);
                    System.out.println("\nAddition: "+ans);
                    break;

                case 2:

                    num1=Integer.valueOf(args[0]);
                    num2=Integer.valueOf(args[1]);
                    ans=diff(num1,num2);
                    System.out.println("Difference: "+ans);
                    break;
                case 3:

                    num1=Integer.valueOf(args[0]);
                    num2=Integer.valueOf(args[1]);
                    ans=product(num1,num2);
                    System.out.println("Product: "+ans);
                    break;
                case 4:

                    num1=Integer.valueOf(args[0]);
                    num2=Integer.valueOf(args[1]);
                    ans= (int) divide(num1,num2);
                    System.out.println("Division: "+ans);
                    break;
                case 5:
                    System.out.println("Bye!");
                    System.exit(0);break;
                default:System.out.println("Enter a valid choice!");
            }
            while(true);
    }
}
