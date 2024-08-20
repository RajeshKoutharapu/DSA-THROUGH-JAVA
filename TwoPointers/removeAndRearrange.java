// leeycode Question 27
public class removeAndRearrange {
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val=2;
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
              count++;
           //else
             
                nums[j]=nums[i];
                j++;
             }      }
        System.out.println(count);
    }
}
