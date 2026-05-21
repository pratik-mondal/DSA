package ONE_D_ARRAYS;

import java.util.Scanner;

public class _8_TwoSum {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your target element : ");
        int target = input.nextInt();
        System.out.print("please enter your array size : ");
        int size = input.nextInt();
        int[]arr=new int[size];
        for(int i=0;i< arr.length;i++) arr[i] = input.nextInt();
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target) System.out.print("sum of the target is found at index :"+i+","+j);
            }
        }
    }
}
