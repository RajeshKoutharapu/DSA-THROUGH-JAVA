//leet cod eQuestion number 2154

import java.util.Arrays;

public class Keepmultiplying {
    public static void main(String[] args) {
        int []  nums = {5,3,6,1,12};
        int original = 3;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){

            if(nums[i]>original)
               break;
            if(nums[i]==original){
                original=original*2;
            }
        }
        System.out.println(original);
    }
}
