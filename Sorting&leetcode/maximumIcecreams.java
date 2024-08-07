//leetcode Question number 1833

import java.util.Arrays;

public class maximumIcecreams {
    public static void main(String[] args) {
        int [] costs={1,3,2,4,1};
        int coins=7;
        Arrays.sort(costs);
        long sum=0;
        int count=0;
        for(int i=0;i<costs.length;i++){
              sum+=costs[i];
              if(sum<= coins){
                count++;
              }
        }
        System.out.println(count);
    }
}
