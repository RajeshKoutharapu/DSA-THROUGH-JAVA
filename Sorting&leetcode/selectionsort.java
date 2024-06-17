
//import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionsort{
    public static void main(String[] args) {
        int arr[]={5,7,1,6,0};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
           int last=n-i-1;
           int maxindex=maxmethod(arr,last);
          
           swap(maxindex,last,arr);
        }
        System.out.print(Arrays.toString(arr));
       
     }

    private static void swap(int maxindex, int last,int [] arr) {
        int temp=arr[maxindex];
        arr[maxindex]=arr[last];
        arr[last]=temp;
    }

    private static int maxmethod(int[] arr, int last) {
        int max=0;

        for(int i=1;i<=last;i++){
            if(arr[max]>arr[i]){
                max=i;
            }
        }
        
      return max;
    }
}