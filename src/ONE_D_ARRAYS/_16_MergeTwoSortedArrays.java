package ONE_D_ARRAYS;

public class _16_MergeTwoSortedArrays {
    static void main() {
        int[]a={2,5,6,9,20};
        int[]b={1,3,4,5,7,8};
        int[]c=new int[a.length+ b.length];
        for(int element : c) System.out.print(element+" ");
        merge(c,a,b);
        System.out.println();
        for(int element : c) System.out.print(element+" ");
    }

    public static void merge(int[]c,int[]a,int[]b) {
        int i=0,j=0,k=0;
        while(i<a.length && j< b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else c[k++]=b[j++];
        }
        while(i< a.length) c[k++]=a[i++];
        while(j< b.length) c[k++]=b[j++];

    }
}
