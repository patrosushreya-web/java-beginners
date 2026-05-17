import java.util.Scanner;
public class java6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your total salary?");
        double salary = sc.nextDouble();
        System.out.println("what is your interest rate(in%) ");
        double rate = sc.nextDouble();
        System.out.println("what is the # of times of compound per year:");
        double timescompound = sc.nextDouble();
        System.out.println("enter the number of years?");
        double year = sc.nextDouble();
        System.out.println("enter the amount ");
        double amount = salary * Math.pow(1+rate / timescompound,timescompound*year);
        System.out.println("the amount is: " + amount);
        sc.close();
        
    }
}

