//leetcode Question Number 1089

import java.util.Arrays;

public class Duplicatezeros {
    public static void main(String[] args) {
          int [] arr={1,0,2,3,0,4,5,0};
          int [] t=new int[arr.length];
          int index=0;
          int i=0;
          while(index<arr.length){
             if(arr[i]!=0){
                t[index]=arr[i];
                index++;
             }else{
                index+=2;
             }
           i++;
          }
          System.out.println(Arrays.toString(t));
    }
}
