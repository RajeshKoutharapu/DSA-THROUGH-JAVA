import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortArrayByFrequency {
    public static void main(String[] args) {
        int [] nums={1,1,2,2,2,3};
        List<Integer> list1=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        // for (int inte : nums) {
        //     set.add(inte);
        // }
        // System.out.println(set);
        int res[]=new int[nums.length];
        int index=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
            }else
              map.put(n,1);
        }
       list.addAll(map.values());
       list1.addAll(map.keySet());
       Collections.sort(list1);
       System.out.println(list1);
       System.out.println(list);
       int size=list.size();
    for(int j=0;j<size;j++){
        System.out.println(list);
        int max=Collections.min(list);
         int val=list.indexOf(max);
          
         for(int i=0;i<max;i++){
             res[index]=list1.get(val);
              index++;
         }
         list1.remove(list1.get(val));
         list.remove(list.indexOf(max));
    }
System.out.println(Arrays.toString(res));
    }
}
