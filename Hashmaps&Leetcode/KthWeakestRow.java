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
            int []res=new int[k];
    Map<Integer,Integer> map=new TreeMap<>();
   int count=0;
   int r=mat.length;
   int c=mat[0].length;
   System.out.println(c);
        for(int i=0;i<r;i++){
            count=0;
            for(int j=0;j<c;j++){
                 if(mat[i][j]==1)
                    count++;
            }
            map.put(count*,i);
        }
int cc=0;
        for(Integer val:map.keySet()){
            if(cc<=k)
             res[cc]=val;
        }
    
        System.out.println(Arrays.toString(res));

    }
}
