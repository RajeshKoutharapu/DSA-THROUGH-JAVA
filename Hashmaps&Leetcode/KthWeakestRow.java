import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class KthWeakestRow {
    public static void main(String[] args) {

        int [][]mat={{1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}};
            int k=3;

        // List<Integer> list=new ArrayList<>();
        int [] arr=new int[k];
    Map<Integer,Integer> map=new TreeMap<>();
    int count=0;
   int r=mat.length;
   int c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 if(mat[i][j]==1)
                    count++;
            }
            map.put(count*r+1,i);
            count=0;
        }
        int in=0;
        for(Integer en:map.keySet()){
            System.out.println(en);
                 if(in<k){
                    arr[in]=map.get(en);
                 }else
                    break;
        }
        System.out.println(Arrays.toString(arr));

    }
}
