// leetcode Question number 

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Countnicesubarray {
    public static void main(String[] args) {
        int nums[]={0,1,1};
        int k=1;
    int n=nums.length;
        int [] change=new int[nums.length];
          for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
               change[i]=0;
               else
            change[i]=1;
          }

         
      System.out.println(fondCount(change, k)-fondCount(change, k-1));

          
    }
    static int fondCount(int [] change,int k){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1, 0);
        //  System.out.println(Arrays.toString(change));
        int s=0;
        int r=0;
        int count=0;
        int n=change.length;
        while(r<n){
            map.put(change[r],map.getOrDefault(change[r], 0)+1);
             while (map.get(1)>k) {
                  map.put(change[s],map.get(change[s])-1);
                  if(map.get(change[s])==0)
                  map.put(1, 0);

                    s++;
             }
             count+=(r-s)+1;
             r++;
        }
        return count;
    }
}
