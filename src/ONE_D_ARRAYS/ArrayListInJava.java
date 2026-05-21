package ONE_D_ARRAYS;

import java.util.ArrayList;

public class ArrayListInJava {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);
        for(int element :arr) System.out.print(element+" ");
//        arr.add(2,30);
//        System.out.println();
//        for(int element :arr) System.out.print(element+" ");
//        System.out.println();
//        arr.set(2,100);
//        for(int element :arr) System.out.print(element+" ");
//        System.out.println();
//        System.out.println(arr);
//        int n=arr.size();
//
//        for(int i=0;i<n;i++) System.out.print(arr.get(i)+" ");
//        arr.add(1,100);
//        System.out.println();
//        for(int i=0;i<n;i++) System.out.print(arr.get(i)+" ");
//        System.out.println();
//        Collections.reverse(arr);
//        System.out.println(arr);
        // ARRAY LIST REVERSE
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.print(arr+" ");

    }
}
