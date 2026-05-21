package ONE_D_ARRAYS;

import java.util.Scanner;

public class _5_MinElementFound {
    static void main() {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        System.out.print("please enter your array size : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++) arr[i]=input.nextInt();
        for(int i=0;i<size;i++) {
            if(min>arr[i]) min=arr[i];
        }
        System.out.println(min);
    }
}
