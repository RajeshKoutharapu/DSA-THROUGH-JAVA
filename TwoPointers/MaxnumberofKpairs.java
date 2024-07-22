//leetcode Question num ber 1679

import java.util.Arrays;

public class MaxnumberofKpairs {

    public static void main(String[] args) {
        int nums[]={4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k=2;
          Arrays.sort(nums);
        int count=0;
        int l=0;
        int h=nums.length-1;
        while(l<h){
            if(nums[l]+nums[h]<k){
                 l++;
            }else if(nums[l]+nums[h]>k)
                h--;
                else{
                  count++;
                  h--;
                  l++;
                }
        }
       System.out.println(count);
    }
}