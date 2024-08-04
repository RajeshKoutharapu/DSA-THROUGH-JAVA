//leetcode number 2190

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber {
    public static void main(String[] args) {
        int [] nums={1,100,200,1,100};
        int key=1;
         Map<Integer,Integer> map=new HashMap<>();
        int max=0,el=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                if(map.containsKey(nums[i+1]))
                      map.put(nums[i+1],map.get(nums[i+1])+1);
                  else
                    map.put(nums[i+1],1);
            }
        }
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]==key)
          {
            if(map.get(nums[i+1])>max){
                  max=map.get(nums[i+1]);
                  el=nums[i+1];
            }
          }
       }
    System.out.println(el);
    }
}
