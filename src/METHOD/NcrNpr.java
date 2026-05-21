package METHOD;

import java.util.Scanner;

public class NcrNpr {
    static int fact(int k) {
        int fact =1;
        for(int i =1;i<=k;i++){                    // MAIN PART OF FUNCTION
            fact*=i;
        }
        return fact;
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the n value : ");
        int n = input.nextInt();
        System.out.print("enter the r value : ");
        int r = input.nextInt();
        System.out.println("the NcR is : "+(fact(n))/(fact(r)*fact(n-r))); // NCR PRINT
        System.out.print("the NpR is : "+(fact(n))/(fact(n-r))); //NPR PRINT
    }
}
