import java.util.Random;

public class Java4 {
    public static void main(String[] args) {
        //question is to create a program to generate a random number between 1 and 100
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("random number between 1 and 100 = " + randomNumber);
    }
}
