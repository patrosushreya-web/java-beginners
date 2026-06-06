import java.util.Scanner;
public class foodinterface {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        venue o1 = new venue();
        o1.taste();
        int a = sc.nextInt();
        o1.taste(a);
        int amount = bevarage.amount;
        System.out.println("The amount of bevarage is: "+amount);
        sc.close();

    }
}
interface food{
    void taste();
}
interface bevarage{
    void taste();
    int amount = 100;
}
interface dessert{
    void taste(int a);

}
class venue implements food,bevarage,dessert{
    public void taste(){
        System.out.println("This is a food item.");
    }
    public void taste(int a){
        System.out.println("This is a dessert item.");
    }
    

}