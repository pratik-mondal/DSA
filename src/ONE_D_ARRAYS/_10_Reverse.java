package ONE_D_ARRAYS;

import java.util.Scanner;

public class _10_Reverse {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int size = input.nextInt();
        int[]arr= new int[size];
        System.out.print("please enter your array element : ");
        for(int i=0;i<arr.length;i++) arr[i]=input.nextInt();
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("reverse element is : ");
        for(int element :arr) System.out.print(+element+" ");
    }
}
