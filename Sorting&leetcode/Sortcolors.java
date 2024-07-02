//leetcode Question number 75
import java.util.Arrays;

public class Sortcolors {
    public static void main(String[] args) {
         int [] nums={1,2,1,0,0,1};
	 int zc=0;
        int oc=0;
        int tc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            zc++;
            else if(nums[i]==1)
            oc++;
            else
             tc++;
        }
       for(int i=0;i<nums.length;i++){
               if(zc>0){
                nums[i]=0;
                zc--;
               }else if(oc>0){
                nums[i]=1;
                oc--;
               }else
                 nums[i]=2;

       }
        System.out.println(Arrays.toString(nums));
    }
}
