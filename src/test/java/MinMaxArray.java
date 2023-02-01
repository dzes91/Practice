import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        // Find min number
        int [] nums = {1,5,4,9,1,6,8,9};
        int [] nums1 = {1,5,4,9,1,6,8,9};

        int min = nums[0];
        int max = nums1[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];

            }
            for (int j = 0; j < nums1.length; j++) {
                if (nums[i] > max);
                max = nums[i];

            }

        }
        System.out.println("Min Number: " + min);
        System.out.printf("Max number: " + max);


    }


}
