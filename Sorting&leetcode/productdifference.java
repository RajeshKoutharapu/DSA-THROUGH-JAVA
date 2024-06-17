// leetcode Question number 1913

import java.util.Arrays;

public class productdifference {
public static void main(String[] args) {
    int [] nums = {4,2,5,9,7,4,8};
    int l=nums.length;
    Arrays.sort(nums);

    int res=nums[l-1]*nums[l-2]-nums[0]*nums[1];
   System.out.println(res);
}
    
}