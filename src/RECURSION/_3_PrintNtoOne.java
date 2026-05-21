package RECURSION;

import java.util.Scanner;

public class _3_PrintNtoOne {
    static void main() {
      Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int num = input.nextInt();
        print(num);
    }
    public static void print(int num){
        if(num==0) return;
        System.out.print(num + " ");
        print(num - 1);
    }
}
