// leetcode Question number1520

import java.util.Arrays;

public class ArthamaticProgression {

     public static void main(String[] args) {
        int [] arr={1,2,4};
        boolean b=true;
        Arrays.sort(arr);
        int temp=arr[0]-arr[1];
        for(int i=1;i<arr.length-1;i++){
            int temp1=arr[i]-arr[i+1];
              if(temp==temp1||temp== -temp1)
                  continue;
            else{
               b=false;
               break;
            }
        }
        System.out.println(b);
     }
}