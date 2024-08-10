import java.util.Arrays;

public class numberofsubarrays {
    public static void main(String[] args) {
        int arr []={-1,-2};
        // if(arr.length==1)
        // return arr[0];
      int sum=0;
      int csum=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             if(sum>0){
                csum=Math.max(csum,sum);
             }
            else
                  sum=0;

          }
          if(csum<0){
            //csum=0;
              for(int i=0;i<arr.length;i++){
                  csum=Math.max(csum, arr[i]);
              }
          }
      
     // return csum;
        System.out.println(csum);
    }
}
