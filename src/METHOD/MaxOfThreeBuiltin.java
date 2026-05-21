package METHOD;

import java.util.Scanner;

public class MaxOfThreeBuiltin {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter first number : ");
        int a = input.nextInt();
        System.out.print("please enter second number : ");
        int b = input.nextInt();
        System.out.print("please enter third number : ");
        int c = input.nextInt();
        System.out.println("the max value is : "+ Math.max(Math.max(a,b),c));
    }
}
