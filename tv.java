import java .util.Scanner;
public class tv {
    public static void main(String []args){
        Samsung o1 = new Samsung();
        LG o2 = new LG();
        o1.power();
        o2.power();
        o1.volume();
        o2.volume();


    }
}
interface remote{
    //you cannot create object of an interface, but you can create reference variable of an interface
    abstract void volume();
    //
    abstract void power();
    //usage of abstract method or not is optional in interface, by default all methods are abstract in interface
    public static int volume =10;
    //jab bhi ya inherit karenge to volume variable bhi inherit hoga, and it will be final by default, so you cannot change its value
    //final keyword is used to declare a constant variable, which means its value cannot be changed once it is assigned


}
class Samsung implements remote{
    public void volume(){
        System.out.println("Volume is: "+remote.volume);
    }
    public void power(){
        System.out.println("Power is ON");
    }
}
class LG implements remote{
    public void power(){
        System.out.println("Power is ON");

    }
    public void volume(){
        System.out.println("Volume is: "+remote.volume);
    }
}