package RECURSION;

import java.util.Scanner;

public class _6_aRaisedToPowerBlogTimeComplex {
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
        int call = power(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
}
