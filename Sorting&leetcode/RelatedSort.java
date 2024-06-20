// leetecode question number 1122

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelatedSort
{
    public static void main(String[] args) {
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19}; 
        int []arr2 = {2,1,4,3,9,6};
        Map<Integer,Integer> map=new HashMap<>();
        for (int a1:arr1){
            if(map.containsKey(a1)){
                map.put(a1,map.get(a1)+1);
            }else{
                map.put(a1,1);
            }
        }
        int [] ans=new int[arr1.length];
        int c=0;
        for(int a1:arr2){
    
        while(map.get(a1)>0){
            ans[c]=a1;
            c++;
            map.put(a1,map.get(a1)-1);
        }
        map.remove(a1);
     
        }
     int [] rem=new int[arr1.length-c];
     int index=0;
     for(int a1:arr1){
        if(map.containsKey(a1)){
            while(map.get(a1)>0){
            rem[index]=a1;
            index++;
             map.put(a1,map.get(a1)-1);
        }
        map.remove(a1);
     }
     }
     Arrays.sort(rem);
       for(int n:rem){
        ans[c]=n;
        c++;
       }
System.out.println(ans);
    }
}