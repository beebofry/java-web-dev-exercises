package exercises;

import java.util.ArrayList;

public class AddEvenNumbers {
    public static Integer getSum(ArrayList<Integer> evenNums) {
        int sum = 0;
        for (Integer num : evenNums) {
            if (num%2 ==0) {
                sum += num;
            }
        }
        return sum;
    }
}
