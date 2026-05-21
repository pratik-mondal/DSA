package ONE_D_ARRAYS;

import java.util.Scanner;

public class _9_SecMaxElement {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int size = input.nextInt();
        int[]arr=new int[size];
        System.out.print("enter your array element");
        for(int i=0;i< arr.length;i++) arr[i]=input.nextInt();
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }
        for(int i=0;i< arr.length;i++){
            if( smax<arr[i] && max !=arr[i]) smax=arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
