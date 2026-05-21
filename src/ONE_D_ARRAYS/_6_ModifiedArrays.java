package ONE_D_ARRAYS;

import java.util.Scanner;

public class _6_ModifiedArrays {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int size = input.nextInt();
        int[]arr = new int[size];
        for(int i=0;i< arr.length;i++)  arr[i]=input.nextInt(); //ARRAY INPUT LOOP
        for(int i=0;i< arr.length;i++) {
           if(i%2 != 0) arr[i]*=2;
            else arr[i]+=10;
        }
        for(int i=0;i< arr.length;i++) System.out.println(arr[i]);
    }
}
