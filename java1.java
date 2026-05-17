import java.util.Scanner;
public class java1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //variables = act as reusable container for a value
      //there are 2 types of variable primitive and refrance
      //primitive = simple value are being dirctly stord
      //types of variables
        //1. byte = 1 byte = 8 bits
        //2. short = 2 byte = 16 bits
        //3. int = 4 byte = 32 bits
        //4. long = 8 byte = 64 bits
        //5. float = 4 byte = 32 bits
        //6. double = 8 byte = 64 bits
        //7. char = 2 byte = 16 bits
        //8. boolean = 1 byte = 8 bits
      //refrance variable = store the memory address of an object
      int age = 18;
      int year = 2024;
      int quantity = 10;
      double price = 24.89;
      double sgpa =9.12;
      char grade ='B';
      boolean ispassed = true;
      boolean isfailed = false;
      if(ispassed){
         System.out.println("student is passed");
      }
       else{
         System.out.println("student is failed");
      }
      System.out.println("age ="+ age);
      System.out.println("year ="+ year);
      System.out.println("quantity ="+ quantity);
      System.out.println("price ="+ price);
      System.out.println("sgpa ="+ sgpa);
      System.out.println("grade ="+ grade);
      System.out.println("ispassed ="+ ispassed);
      System.out.println("isfailed ="+ isfailed);
      //string is a series of charachters and it is a class in java
      String name ="java programming";
      System.out.println("name ="+ name);
      //accepting scannerinput for user input
      //1. next() = it is used to read a single word input from the user
      //2. nextLine() = it is used to read a line of input from the
        //user, including spaces
        //3. nextInt() = it is used to read an integer input from the user
        //4. nextDouble() = it is used to read a double input from the user
        //5. nextBoolean() = it is used to read a boolean input from the user
    int number = sc.nextInt();
    System.out.println("number ="+ number);
     String name1 = sc.next();
     System.out.println("name1 ="+ name1);
     String name2 = sc.nextLine();
     System.out.println("name2 ="+ name2);
     double price1 = sc.nextDouble();
     System.out.println("price1 ="+ price1);
    boolean istrue  = sc.nextBoolean();
    System.out.println("istrue ="+ istrue);

//always remember to close the scanner objectafter  initiating a  scaaner
sc.close();

   
    
   }
    
}
