import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UniqueElementsArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4,6,6,5,5,8,9,0,8,9,0));
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer each : list) {
            int frequency = Collections.frequency(list,each);
            if (frequency==1){
                unique.add(each);
            }


        }
        System.out.printf("Unique number: " + unique);

        }

        }
