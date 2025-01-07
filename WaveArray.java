import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int [] arr={2,3,7,8,9,10};
        int l=arr.length;
       int ll=0;
        
        if(l%2==0)
          ll=l-1;
          else
            ll=l;

        for(int i=0;i<ll-1;i+=2){
           int temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
