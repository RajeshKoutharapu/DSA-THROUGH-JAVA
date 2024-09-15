//leetcode number 209
public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int target=77;
        int[]  nums={2,3,1,2,7,3};
        int i=0,j=0,minlen=Integer.MAX_VALUE;
        //System.out.println(minlen);
        int sum=0;
          while (j<nums.length) {
            sum+=nums[j];
            if(sum>=target){
               minlen=Math.min(minlen,(j-i)+1);
               sum-=nums[i]+nums[j];
               i++;
            }else
              j++;


          }
          if(minlen==Integer.MAX_VALUE)
          System.out.println(0);
          else
       System.out.println(minlen);

    }
}
