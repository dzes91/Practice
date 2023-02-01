public class ReverseString {
    public static void main(String[] args) {


        String word = "123456789";
        String reverse = " ";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);

        }
        System.out.printf(reverse);


    }
}