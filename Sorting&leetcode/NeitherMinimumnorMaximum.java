import java.util.Arrays;
// leetcode Question number 2733
public class NeitherMinimumnorMaximum {
    public static void main(String[] args) {
           int []nums = {3,2,1,4};  
           Arrays.sort(nums);
           if(nums.length<3){
               System.out.println(-1);
           }else{
              int ans=nums.length/2;
              System.out.println(ans);
           }
 }
}
