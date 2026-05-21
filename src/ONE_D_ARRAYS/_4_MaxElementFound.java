package ONE_D_ARRAYS;

import java.util.Scanner;

public class _4_MaxElementFound {
    static void main(String[] args) {
        int max =Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.print("please enter your array element : ");
        for(int i=0;i<size;i++)  arr[i] = input.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("the maximum element is : "+max);
    }
}
