// leetcode Question number 485
public class MaxumumConsicutive1s {
    public static void main(String[] args) {
        int [] nums={0,1,1,0,1,1,1,1,0};
        int e=0;
        int max=0,c=0;
        while(e<nums.length){
              if(nums[e]==1){
                c++;
              }else{
                max=Math.max(max,c);
                c=0;

              }
              e++;
        }
        System.out.println ((max>c)?max:c);
    }
}
