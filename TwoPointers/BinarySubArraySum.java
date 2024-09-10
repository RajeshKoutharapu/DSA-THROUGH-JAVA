//leetcode question number 930

import java.util.HashMap;
import java.util.Map;

public class BinarySubArraySum {
    public static void main(String[] args) {
        int nums[]={1,0,1,0,1};
        int k=2;
   System.out.println(findsubarraycount(nums, k)-findsubarraycount(nums, k-1));
    }

    static int findsubarraycount(int nums[] ,int k){
        int s=0;
        int e=0;
       // Map<Integer,Integer> map=new HashMap<>();
       int sum=0;
       int count=0;
         while(e<nums.length){
               sum+=nums[e];
               while(sum>k){
                sum-=nums[s];
                s++;
               }

               count+=(e-s)+1;
               e++;
         }
        return count;
    }
}
