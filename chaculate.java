import java.util.Arrays;

public class chaculate {
    public static void main(String[] args) {
       int [] arr={1,4,3,2,6,7};
       //Arrays.sort(arr);
       int sum=0;
       int res=0;
       
       while(sum<arr.length){
        if (arr[sum]==0) {
            System.out.println(-1);
            return;
         }
         
           sum=arr[sum]+sum;
          if(sum<arr.length)
             res++;
       }
  System.out.println(res);

    }
   
    }

