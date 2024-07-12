import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MejorityElement {
    public static void main(String[] args) {
        int [] nums={2,2,1,1,1,2,2};
        Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else
              map.put(n,1);
        }
     for(Map.Entry<Integer,Integer> mapq:map.entrySet()){
        if(mapq.getValue()>nums.length/2){
           System.out.println( mapq.getKey());
           break;
        }
     }
     
    }
}
