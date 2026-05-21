package RECURSION;

import java.util.Scanner;

public class _1_PintOneToN {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int num = input.nextInt();
        print(1,num);
    }
    public static void print(int i,int num){
        if(i>num) return;
        System.out.print(i + " ");
        print(i+1,num);
    }
}
