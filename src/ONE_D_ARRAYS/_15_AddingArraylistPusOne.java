package ONE_D_ARRAYS;

import java.util.ArrayList;
import java.util.Collections;

public class _15_AddingArraylistPusOne {
    static void main() {
        int[]qrr={1,8,9,9,9,9};
        ArrayList<Integer>arr=new ArrayList<>();
        int n= qrr.length;
        int carry=1;
        for(int i=n-1;i>=0;i--){
            if(qrr[i]+carry<=9){
                arr.add(qrr[i]+carry);
                carry=0;
            }
            else {
                arr.add(0);
                carry=1;
            }
        }
        if(carry==1) arr.add(1);
        Collections.reverse(arr);
        System.out.print(arr);
    }
}
