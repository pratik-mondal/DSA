package ONE_D_ARRAYS;

import java.util.Scanner;

public class InputOutput {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR ARRAY SIZE : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("PLEASE ENTER YOUR ELEMENT : ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("THE ELEMNET LIST :  : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
