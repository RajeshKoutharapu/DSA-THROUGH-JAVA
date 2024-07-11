//leetcode question 3194
import java.util.Arrays;

public class MinimumAverageofsmallLarge {
    public static void main(String[] args) {
        int [] nums = {7,8,3,4,15,13,4,1};
        Arrays.sort(nums);
     double avg=0;
     double res=Double.MAX_VALUE;
     int l=0;
     int h=nums.length-1;
       while(l<h){
              avg=(nums[l]+nums[h])/2d;
              h--;
              l++;
              if(avg<res)  
                res=avg;     
       }
    System.out.println(res);
    }
}
