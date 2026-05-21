package ONE_D_ARRAYS;

public class _12_MissingArray {
    static void main() {
        int[]arr={2,3,4};
        int n= arr.length+1;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
        }
        int sum=n*(n+1)/2;
        System.out.println(sum-temp);
    }
}
