public class java9 {
    public static void main (String[]args){
        String email = "sushreyapatro@gmail.com";
        //split() = A method used to divide a string into an array of substrings based on a specified delimiter, allowing for easy manipulation and access to individual parts of the string.
        String[] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }
    
}
