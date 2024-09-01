// leetcode Question number 992

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithkdiffinteger {
     public static void main(String[] args) {
        int nums[]={1,2,1,2,3};
        int k=2;
            System.out.println(findsubstring(nums, k)-findsubstring(nums, k-1));
     }

     static int findsubstring(int [] nums,int k){
           int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        int l=0,r=0;
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
           while (map.size()>k) {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                     {
                        map.remove(nums[l]);
                     }
                     l++;
           }
           count+=(r-l)+1;
             r++;
        }
        return count;
     }
}
