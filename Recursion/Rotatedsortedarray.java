public class Rotatedsortedarray {
    public static void main(String[] args) {
        int [] num={5,6,7,1,2,3,4};
        int key=0;
        System.out.println(bsr(num,0,num.length-1,key));

    }
    static int bsr(int [] nums,int l,int h,int target){
        
        int mid=(l+h)/2;
        if(l>h)
           return -1;
        if(nums[mid]==target)
           return mid;

        if(nums[mid]>=nums[l]){
         if(nums[l]<=target&&nums[mid]>=target){
            return bsr(nums, l, mid-1, target);
         }else{
             return bsr(nums, mid+1, h, target);
            }
        }
       if(nums[mid]<=target && nums[h]>=target){
            return bsr(nums, mid+1, h, target);
            }

             return bsr(nums, l, mid-1, target);
        }   



    }
