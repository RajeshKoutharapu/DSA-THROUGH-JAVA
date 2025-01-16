import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class merge2dArrays {
    public static void main(String[] args) {
      int[][]  nums1 = {{1,2},{2,3},{4,5}} ;
      int [][] nums2 = {{1,4},{3,2},{4,1}};
         Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums1.length;i++){
             map.put(nums1[i][0],map.getOrDefault(nums1[i][0],0)+nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++){
             map.put(nums2[i][0],map.getOrDefault(nums2[i][0],0)+nums2[i][1]);
        }
        int [][] res=new int[map.size()][2];
        int index=0;
        for(Integer i:map.keySet()){
            res[index][0]=i;
            res[index][1]=map.get(i);
            index++;
        }
        System.out.println(Arrays.toString(res));
    }
}
