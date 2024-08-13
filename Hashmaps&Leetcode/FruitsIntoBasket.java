// leetcode Question number 904

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int [] nums={3,3,3,1,2,1,1,2,3,3,4};
        int maxl=0;
        int l=0,r=0;
        Map<Integer,Integer> map=new HashMap<>();
        while (r<nums.length) {
            // if(map.containsKey(nums[r]))
            //   map.put(nums[r],map.get(nums[r])+1);
            //   else
            //    map.put(nums[r],1);
              map.put(nums[r],map.getOrDefault(nums[r],0)+1);
               if(map.size()<=2){
                maxl=Math.max(maxl,(r-l)+1);
               }else{
               // while(map.size()>2){
                    map.put(nums[l],map.get(nums[l])-1);
                      if(map.get(nums[l])==0)
                         map.remove(nums[l]);
                         l++;
                        
              //  }
               }
        

        r++;
    }
    System.out.println(maxl);
}
}