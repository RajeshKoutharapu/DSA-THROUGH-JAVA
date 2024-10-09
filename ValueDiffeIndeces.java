//leetcode 2903
public class ValueDiffeIndeces {
    public static void main(String[] args) {
       int nums [] = {23,31,14,42,0,49};
       int in= 4, va = 44;
       int i=0;
       int t=in;
       while(i<nums.length && in<nums.length){
        if(Math.abs(nums[i]-nums[in])>=va){
            System.out.println(i+" "+in);
             break;
        }
        in++;
        if(in>nums.length-1){
           in=++t;
           i++;
        }
       }
    }
}
