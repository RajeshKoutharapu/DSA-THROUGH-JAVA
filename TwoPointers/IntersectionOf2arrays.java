//letcode Question 350

import java.util.Arrays;

public class IntersectionOf2arrays {

    public static void main(String[] args) {
        int []nums1={1,2,2,1};
        int []nums2={2,2};
          Arrays.sort(nums1);
          Arrays.sort(nums2);
          int i=0,j=0,t=0;
          while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j])
                j++;
                else if(nums1[i]<nums2[j])
                  i++;
                  else{
                    nums1[t]=nums1[i];
                    t++;
                    i++;
                    j++;
                  }
          }
         System.out.println(Arrays.copyOfRange(nums1,0,t));
    }
}