import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElementsArrayList {
    //Unique Number
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4,6,6,5,5,8,9,0,8,9,0));
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer each : list) {
            if (list.indexOf(each)==list.lastIndexOf(each)){
                unique.add(each);


            }




        }
        System.out.printf("Unique number: " + unique);

        }



    }

