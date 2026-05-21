package ONE_D_ARRAYS;

public class _11_RotateArray {
    public static void reverse(int[]arr,int k,int j) {
        while(k<j){
            int temp=arr[k];
            arr[k]=arr[j];
            arr[j]=temp;
            k++;
            j--;
        }
    }
    static void main() {
        int []arr={1,2,3,4,5,6,7};
        int n= arr.length-1;
        int d=3;
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n);
        reverse(arr,0,n);
        for(int i=0;i< arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}
