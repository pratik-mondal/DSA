package ONE_D_ARRAYS;

import java.util.Arrays;

public class SortArrayBuiltin {
    static void print(int[]brr) {
        for(int i=0;i< brr.length;i++) System.out.print(brr[i]+" ");
        System.out.println();
    }

    static void main() {
        int[] arr = {0,5,23,533,4,21,5,11,15,-80};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
}
