
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr={2,6,4,1,5,3};
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                 int temp=arr[i];
                 arr[i]=arr[correct];
                 arr[correct]=temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
