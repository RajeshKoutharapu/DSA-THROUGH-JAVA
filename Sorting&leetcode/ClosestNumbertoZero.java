import java.util.Arrays;

public class ClosestNumbertoZero {
    public static void main(String[] args) {
        int[] nums={-4,-2};
        Arrays.sort(nums);
       // Arrays.sort(nums);
        int l=0;
        int e=nums.length-1;
        while(l<=e){
            int mid=(l+e)/2;
            if(nums[mid]==0)
           System.out.println(nums[mid]);
            else if(nums[mid]>0)
               e=mid-1;
               else
                 l=mid+1;
        }
        if(l>nums.length-1)
      System.out.println(nums[l-1]);
      else
      System.out.println(nums[l]);
    }
}
