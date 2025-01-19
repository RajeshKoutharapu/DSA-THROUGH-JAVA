import java.util.Arrays;

public class minimumdifference {
      public static void main(String[] args) {
        int [] nums={9,4,1,7};
        int k=3;
        if(nums.length<k || nums.length==1)
             System.out.println(0);
            
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int i=0;
        int e=k-1;
        while (e<nums.length) {
            if(nums[e]-nums[i]<min)
                  min=nums[e]-nums[i];

                  i++;
                  e++;
        }
        System.out.println(min);
      }
}
