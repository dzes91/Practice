public class Palindrome {
    public static void main(String[] args) {

        String word = "noon";
        String reverse = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse += word.charAt(i);

        }
        System.out.println(reverse);
        if (word.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");

        }

    }
}
