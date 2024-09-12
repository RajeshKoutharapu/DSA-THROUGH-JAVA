
//leetcode Question number 581
public class ShortestUnsotredsubArray {

     public static void main(String[] args) {
        int nums[]={1,4,3,4};
        int l=0;
        int r=nums.length-1;
        int point=0,p=0;
        while(r>l){
             int min=findsamll(nums, l);
             
             if(nums[l]==min)
                l++;
                else
            {
                p=l;
                break;
            }
        }

        while(l<r){
            int max=findMax(nums,l,r);
            if(nums[r]==max)
               r--;
               else{
                point=r;
                break;
               }
        }
        if(p-point==0)
           System.out.println(0);
           else
        System.out.println(Math.abs(p-point)+1);
     }
     static int findsamll(int nums[],int index){
        int min=Integer.MAX_VALUE;
            for(int i=index;i<nums.length;i++){
                      if(nums[i]<min)
                        min=nums[i];
     }
        return min;
     }

     static int findMax(int[] nums,int index,int last){
        int max=Integer.MIN_VALUE;
        for(int i=index;i<=last;i++){
            if(nums[i]>max)
               max=nums[i];
        }
        return max;
     }
}