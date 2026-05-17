public class java10 {
    public static void main (String[]args){
        //to check the string is palindrome or not
        String str = "madam";
        //stringbuilder is used to reverse the string
        //reverse() is used to reverse the string
        //toString() is used to convert the stringbuilder to string
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
