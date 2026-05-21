package ONE_D_ARRAYS;

import java.util.Scanner;

public class _7_SearchInArray {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int size = input.nextInt();
        System.out.print("please enter your searching element : ");
        int search = input.nextInt();
        int[]arr=new int[size];
        System.out.print("enter your array element : ");
        for(int i=0;i< arr.length;i++) arr[i]= input.nextInt();         // INPUT LOOP
        int check = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==search) check =1;
        }
        if(check==1) System.out.print("the element is found ");
        else System.out.print("the element is not found ");
    }
}
