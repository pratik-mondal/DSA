package ONE_D_ARRAYS;

public class _13_SegregatingZerosAndOnes {
    static void main() {
        int[]arr={1,0,0,1,1,1,0,1,0,1,1,0};
        int zcount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0) zcount++;
        }
        for (int i=0;i<zcount;i++){
            System.out.print(0+" ");
        }
        for (int i=0;i<(arr.length-zcount);i++){
            System.out.print(1+" ");
        }
    }
}
