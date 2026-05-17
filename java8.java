public class java8 {
    public static void main (String[]args){
        //.substring() = A method used to extract a portion of a string, starting at a specified index and extending to the end of the string or to a specified end index.
        String email = "sushreyapatro@gmail.com";
        String username = email.substring(0, 6);
        System.out.println(username);
        //contains() = A method used to check if a string contains a specific sequence of characters, returning true if found and false otherwise.
        boolean contains = email.contains("d");
        System.out.println(contains);
        //check how many times a specific word is present in a string
        String sentence = "sushreya is a good girl and sushreya is a good student";
        String word = "sushreya";
        int count = 0;
        int index = sentence.indexOf(word);
        while (index != -1) {
            count++;
            index = sentence.indexOf(word, index + 1);
        }
        System.out.println("The word '" + word + "' appears " + count + " times in the sentence.");
    }
}
