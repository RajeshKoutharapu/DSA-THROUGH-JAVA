
//leet code Qustion number 1051

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int [] heights={1,1,4,2,1,3};
         int [] temp=new int [heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++){
            temp[i]=heights[i];
        }        
        Arrays.sort(temp);
        for(int i=0;i<heights.length;i++){
            if(temp[i]!=heights[i])
              count++;
        }
        System.out.println(count);
    }
}
