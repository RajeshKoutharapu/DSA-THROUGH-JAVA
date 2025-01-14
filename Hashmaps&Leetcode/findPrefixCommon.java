//leetcode question number 2657

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class findPrefixCommon {
    public static void main(String[] args) {
          int [] A = {1,3,2,4};
          int [] B = {3,1,2,4};
          int c[] =new int[A.length];
          Map<Integer,Integer> map=new HashMap<>();
          int temp=0;
          int postsum=0;
          for(int i=0;i<A.length;i++){
            temp=0;
           map.put(A[i],map.getOrDefault(A[i],0)+1);
           map.put(B[i],map.getOrDefault(B[i],0)+1);
           if(A[i]==B[i])
             temp++;
             else{
           if(map.get(A[i])==2)
             temp++;
             if(map.get(B[i])==2)
             temp++;

             }

             postsum+=temp;
             c[i]=postsum;

        

    }
    System.out.println(Arrays.toString(c));
}
}
