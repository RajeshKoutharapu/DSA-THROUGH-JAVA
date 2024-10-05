// leetcode Question number 2441

import java.util.Arrays;

public class LargestPosivtiveInt {
    public static void main(String[] args) {
        int [] nums={14,33,40,-33,8,-24,-42,30,-18,-34};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int st=0;
        int en=nums.length-1;
        int larg=-1;
        while(st<en){
           if(nums[st]<0){
                 if(nums[st]*-1==nums[en]){
                    larg=Math.max(larg,nums[en]);
                    st++;
                    en--;
                 }
                    else if(nums[st]*-1<nums[en]){
                        en--;
                    }
                    else{
                        st++;
                    }
           }else
              break;
        }
        System.out.println(larg);
    }
}
