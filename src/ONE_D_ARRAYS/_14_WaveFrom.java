package ONE_D_ARRAYS;

import java.util.Scanner;

public class _14_WaveFrom {
    // 1 2 3 4 5
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int size = input.nextInt();
        int[]arr=new int[size];
        System.out.print("please enter your array element : ");
        for (int i=0;i< arr.length;i++) arr[i]=input.nextInt();
        int temp =0;
        for (int i=0;i< arr.length;i+=2){
            if(i==arr.length-1) break;
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.print("wave array is : ");
        for(int element :arr) System.out.print(element+" ");
    }
}
