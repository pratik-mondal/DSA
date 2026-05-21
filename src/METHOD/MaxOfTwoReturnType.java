package METHOD;

import java.util.Scanner;

public class MaxOfTwoReturnType {
    public static int max(int x,int y) {
       return Math.max(x,y);
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the 1st value : ");
        int a = input.nextInt();
        System.out.print("enter the 2nd value : ");
        int b = input.nextInt();
        System.out.print("the max number is : "+max(a,b));
    }
}
