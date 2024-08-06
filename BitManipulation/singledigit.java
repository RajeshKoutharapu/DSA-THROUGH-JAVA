import java.util.Arrays;

public class singledigit {
    public static void main(String[] args) {
        int [] nums={1,1,2,2,3};
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]^nums[i+1])!=nums[i]){
             System.out.println(nums[i]);
             break;
            }
        }
    }
}
