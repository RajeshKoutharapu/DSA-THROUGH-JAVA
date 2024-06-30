import java.util.Arrays;

public class Moveleft {
     public static void main(String[] args) {
        int [] arr={3,5,7,8,1,3};
        int k=3;
        int temp=arr[k];
        for(int i=k;i>0;i--){
             arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
     }
}
