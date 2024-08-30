//leetcode Question number 1652

import java.util.Arrays;

public class DefuseBomb {
    public static void main(String[] args) {
        int c[]={5,7,1,4};
        int k=-2;
        int n=c.length;
        int res[] =new int[n];
        int sum=0;
        if(k==0)
           System.out.println(Arrays.toString(res));
           else if(k>0)
           {
            for(int i=0;i<n;i++){
                for(int j=1;j<=k;j++){
                    sum+=c[(i+j)%n];
                }
                res[i]=sum;
                sum=0;
            }
            System.out.println(Arrays.toString(res));
           }
           else
           {
            for(int i=0;i<n;i++){
                for(int j = 1; j <= -1 * k; j++){
                    sum+=c[(i-j+n)%n];
                }
                res[i]=sum;
                sum=0;
            }
            System.out.println(Arrays.toString(res));
           }
    }
}
