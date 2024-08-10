//leetcode Question number 645

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int nums[]={1,2,2,4};
        Arrays.sort(nums);
        int sum=0,dp=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(i<n-1){
             if(nums[i]==nums[i+1]){
                sum+=nums[i];
                dp=nums[i];
                i++;
             }
             else{
                sum+=nums[i];
             }
            }else{
                sum+=nums[i];
             }
        }
       int  tsum=n*(n+1)/2-sum;
    System.out.println(dp+" "+tsum);
    }
}
