package RECURSION;

import java.util.Scanner;

public class _4_FactOfANumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int n = input.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n) {
        if(n==0 || n==1 ) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
}
