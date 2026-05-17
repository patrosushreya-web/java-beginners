public class java7 {
    public static void main (String[]args){
        //string methods
        //length
        String name = "    sushreya    ";
        int leth = name.length();
        System.out.println(leth);
        //by charat()to fine the word in specific word
        //acording to index number
        char letter = name.charAt(2);
        System.out.println(letter);
        //finding the word by index number
        int index = name.indexOf('a');
        System.out.println(index);
        //finding the lastindex of specific word
        int lastindex = name.lastIndexOf("s");
        System.out.println(lastindex);
        //writing in uppercase
        String upper = name.toUpperCase();
        System.out.println(upper);
        //writing in lower case
        String lower = name.toLowerCase();
        System.out.println(lower);
        //removing extra space
        String trim =name.trim();
        System.out.println(trim);
        //we can also replace the word
        String replace = name.replace("sushreya","suman");
        System.out.println(replace);
        //isEmpty is used to check the string is empty or not
        String empty = "";
        boolean isEmpty = empty.isEmpty();
        System.out.println(isEmpty);
        
        

    }
    
}
