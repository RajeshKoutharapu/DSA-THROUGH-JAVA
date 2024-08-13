import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class majorityII {
    public static void main(String[] args) {
        int nums[]={3,2,3};
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            // if(map.containsKey(nums[i])){
            //      map.put(nums[i],map.get(nums[i])+1);
            // }else
            //   map.put(nums[i],1);
       map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
    //  for(Map.Entry<Integer,Integer> en: map.entrySet()){
    //        if(en.getValue()>nums.length/3){
    //         list.add(en.getKey());
    //        }
    for(Integer h:map.keySet()){
        if(map.get(h)>nums.length/2)
           list.add(h);
    }
    System.out.println(list);
     }
    
    }

