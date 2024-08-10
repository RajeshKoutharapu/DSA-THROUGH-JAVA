//leet code Question number 1004
public class MaximumConsictive1sIII {
 public static void main(String[] args) {
    int[] nums={0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,1,1};
    int k=3;
    int zc=0,l=0,r=0,len=0,max=0;
      while(r<nums.length){
        if(nums[r]==0)
          zc++;
          //if(zc>k){
            while(zc>k){
              //  l++;
                if(nums[l]==0)
                   zc--;

                   l++;
            }
          //}
         max=Math.max(max,(r-l)+1);
        r++;
      }
      System.out.println(max);
  
 }
}
