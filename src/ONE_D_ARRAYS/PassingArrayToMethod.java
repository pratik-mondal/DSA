package ONE_D_ARRAYS;

public class PassingArrayToMethod {
    static void change(int[]brr) {
        brr[2]=100;
    }
    static void main() {
        int[]arr={1,2,36,4,5,6,7,8};
        System.out.println(arr[2]);
        change(arr);
        System.out.print(arr[2]);
    }
}
