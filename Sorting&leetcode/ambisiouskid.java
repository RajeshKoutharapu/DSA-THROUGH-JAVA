import java.util.Arrays;

public class ambisiouskid {
    public static void main(String[] args) {
        int [] nums={0,-2,3};
        Arrays.sort(nums);
        //  int res= Math.abs(nums[0]-0);
        //  System.out.println(res);
        if(nums[0]<0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=0){
                    System.out.println(Math.abs(nums[i])-0);
                    return ;
                }
            }
        }else
          System.out.println(Math.abs(nums[0]-0));

          int l=0;
          int e=nums.length-1;
          while(l<e){
            int mid=(l+e)/2;
            if(nums[mid]==0)
               {
                System.out.println(0);
                 return;
               }else if(nums[mid]>0)
               e=mid-1;
               else
                 l=mid+1;
                  
          }
          System.out.println(Math.abs(nums[l]-0));
    }
}
