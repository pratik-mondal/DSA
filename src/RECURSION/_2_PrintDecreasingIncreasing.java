package RECURSION;

import java.util.Scanner;

public class _2_PrintDecreasingIncreasing {

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int n = input.nextInt();
        print(1,n);
    }

    public static void print(int x,int n){
        if(n<x) return;
        System.out.print(n+" ");
        print(x, n-1);
       if(n!=1) System.out.print(n+" ");
    }

}
