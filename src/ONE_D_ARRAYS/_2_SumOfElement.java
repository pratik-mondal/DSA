package ONE_D_ARRAYS;

import java.util.Scanner;

public class _2_SumOfElement {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the array size : ");
        int size = input.nextInt();
        int[] arr= new int[size];
        int sum =0;
        System.out.print("please enter your array element : ");
        for(int i=0;i<size;i++) arr[i]=input.nextInt();
        System.out.print("sum the array element is : ");
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.print("the sum is :"+sum);
    }
}
