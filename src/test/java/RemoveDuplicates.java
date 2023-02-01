public class RemoveDuplicates {
    public static void main(String[] args) {

        String word = "noon";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            String ch = "";
            ch += word.charAt(i);
            if (!result.contains(ch)){
                result += ch;

            }


        }
        System.out.println(result);



    }
}
