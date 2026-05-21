package METHOD;

import java.util.Scanner;

public class ArgumentsParameter {
    public static void Max(int a,int b,int c){                   // PARAMETERS
        if(a<=b && c<=b) System.out.print("Maximum number is : "+b);
        if(a<=c && b<=c) System.out.print("Maximum number is : "+c);
        if(b<=a && c<=a) System.out.print("Maximum number is : "+a);
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter first your number : ");
        int a = input.nextInt();
        System.out.print("please enter second your number : ");
        int b = input.nextInt();
        System.out.print("please enter your third number : ");
        int c = input.nextInt();
        Max(a,b,c);                                             // ARGUMENTS
    }
}
