import java.util.Scanner;
public class java2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //question is to create a input used question of filling the blanks 
        System.out.println("what is your name?");
        String name = sc.nextLine();
        System.out.println("what is your age?");
        int age = sc.nextInt();
        System.out.println("what is your grade?");
        System.out.println("A = 90-100\nB = 80-89\nC = 70-79\nD = 60-69\nF = below 60");
        String grade = sc.nextLine();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);
        sc.close();
    }
}
