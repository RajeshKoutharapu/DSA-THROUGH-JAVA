// leetcode 15

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int [] nums={-2,0,1,1,2};
        Arrays.sort(nums);
      List<List<Integer>> list=new  ArrayList<>();
        int i=0;
        int j=1;
        int h=nums.length-1;
         while(j<h){
            if(nums[i]+nums[j]+nums[h]==0){
                List<Integer> l=new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[j]);
                l.add(nums[h]);
                list.add(l);
                i++;
                j++;
                h--;
            }
            else if(nums[i]+nums[j]+nums[h]<0){
                 i++;
                 j++;
            }
            else{
              h--;
            }
         }
         System.out.println(list);
    }
    
}
