//leetcode Question number 2460

import java.util.Arrays;

public class ApplyOperationsOnArray {
    public static void main(String[] args) {
        int [] nums={1};

        if(nums.length<2){
           System.out.println(Arrays.toString(nums));
              return ;
        }
        int l=0;
        int next=1;
        while (next<nums.length) {
               if(nums[l]==nums[next]){
                nums[l]=nums[l]*2;
                nums[next]=0;
                }
               l++;
               next++;
        }
     int [] res=new int[nums.length];
     int index=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            res[index]=nums[i];
            index++;
        }
       }
System.out.println(Arrays.toString(res));
    }
}
