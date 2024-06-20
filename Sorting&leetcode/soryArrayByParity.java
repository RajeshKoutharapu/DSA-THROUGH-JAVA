public class soryArrayByParity {
    public static void main(String[] args) {
        int [] nums={3,1,2,4};
        //int [] ans=new int[nums.length];
        int l=0,h=nums.length-1;
        while (l<h) {
            if(nums[l]%2==0)
             l++;
             else if(nums[h]%2!=0)
               h--;
               else{
                int temp=nums[l];
                nums[l]=nums[h];
                nums[h]=temp;
                l++;
                h--;
               }
            }
            for (int i : nums) {
                System.out.print(i);
            }
    }
    
}
