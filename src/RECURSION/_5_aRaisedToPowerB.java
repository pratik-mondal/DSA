package RECURSION;

import java.util.Scanner;

public class _5_aRaisedToPowerB {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your base  :");
        int a = input.nextInt();
        System.out.print("please enter your power  :");
        int b = input.nextInt();
        System.out.println(power(a,b));
    }
    public static int power(int a,int b){
        if(b==0) return 1;
        int ans = a*power(a,b-1);
        return ans;
    }
}
