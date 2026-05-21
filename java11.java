import java.util.Scanner;
public class java11 {
    static String rev(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {char b=s.charAt(i);
            if(Character.isUpperCase(b))
            {sb.append(Character.toLowerCase(b));
            }
            else
               { sb.append(Character.toUpperCase(b));}
        }
        return sb.toString();
        
    }
    public static void main (String[]args){
        Scanner in=new Scanner (System.in);
        String s=in.nextLine().trim();
        System.out.println(rev(s));
        in.close();
    
}
}