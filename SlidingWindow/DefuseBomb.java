//leetcode Question number 1652

import java.util.Arrays;

public class DefuseBomb {
    public static void main(String[] args) {
        int c[]={5,7,1,4};
        int k=-1;
        int n=c.length;
        int res[] =new int[n];
        int sum=0;
        if(k==0)
           System.out.println(Arrays.toString(res));
           else if(k>0)
           {
            for(int t:c){
               sum+=t;
            }
            for(int i=0;i<n;i++){
                res[i]=sum-c[i];
            }
            System.out.println(Arrays.toString(res));
           }
           else
           {
            for(int t:c){
                sum+=t;
             }
             for(int i=0;i<n;i++){
                int temp=c[i]+c[(i+1)%n];
                res[i]=Math.abs(temp-sum);
            }
            System.out.println(Arrays.toString(res));
           }
    }
}
