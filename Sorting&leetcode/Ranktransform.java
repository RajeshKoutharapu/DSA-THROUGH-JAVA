
// leet code question number 1331


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ranktransform {
    public static void main(String[] args) {
        int []arr = {37,12,28,9,100,56,80,5,12};
        int [] arr1=new int [arr.length];
       for(int i=0;i<arr.length;i++){
        arr1[i]=arr[i];
       }
            Arrays.sort(arr1);
            // for (int i : arr1) {
            //     System.out.print(i+" ");
            // }
            // System.out.println();
            int rank=1;
        Map<Integer,Integer> map=new HashMap<>();
           for (int i : arr1) {
               if(map.containsKey(i)){
                   continue;
               }else
               map.put(i,rank++);
               
           }
          // System.out.println(map);
           int [] res=new int[arr.length];
      for (int i =0;i<arr.length;i++) {
            res[i]=map.get(arr[i]);
      }
for (int i : res) {
    
          System.out.print(i);
}
    }
}
