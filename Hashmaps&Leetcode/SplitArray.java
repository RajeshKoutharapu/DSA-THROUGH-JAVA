import java.util.HashMap;
import java.util.Map;

public class SplitArray {
    public static void main(String[] args) {
        int nums[]={6,1,3,1,1,8,9,2};
         Map<Integer,Integer> map=new HashMap<>();
     
for(int i=0;i<nums.length;i++){
    
   
   if (map.containsKey(nums[i])){
    map.put(nums[i],map.get(nums[i])+1);
         if(map.get(nums[i])>2){
            System.out.println(false);
            return ;
         }
            
    }else{
        map.put(nums[i],1);
    }
}
System.out.println(true);
    }
}
