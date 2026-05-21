package ONE_D_ARRAYS;

import java.util.Arrays;

public class ShallowAndDeepCopy {
    static void main() {
        int [] arr = {1,2,3,4,5,6};
//        int[]x= arr;
//        x[0]=100;                    // SHALLOW COPY
//        System.out.println(arr[0]);
        int []y= Arrays.copyOf(arr,arr.length);  // DEEP COPY
        y[0]=80;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
