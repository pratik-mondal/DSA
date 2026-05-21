package ONE_D_ARRAYS;

import java.util.Scanner;

public class _3_ProductOfElement {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the array size : ");
        int size = input.nextInt();
        int[] arr= new int[size];
        int product =1;
        System.out.print("please enter your array element : ");
        for(int i=0;i<size;i++) arr[i]=input.nextInt();
        for(int i=0;i<size;i++){
            product*=arr[i];
        }
        System.out.print("the product is :"+product);
    }
}

