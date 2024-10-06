// leetcode Question number 2441

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LargestPosivtiveInt {
    public static void main(String[] args) {
        // int [] nums={14,33,40,-33,8,-24,-42,30,-18,-34};
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        // int st=0;
        // int en=nums.length-1;
        // int larg=-1;
        // while(st<en){
        //    if(nums[st]<0){
        //          if(nums[st]*-1==nums[en]){
        //             larg=Math.max(larg,nums[en]);
        //             st++;
        //             en--;
        //          }
        //             else if(nums[st]*-1<nums[en]){
        //                 en--;
        //             }
        //             else{
        //                 st++;
        //             }
        //    }else
        //       break;
        //}
        //System.out.println(larg);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] A=new int[n];
        int [] B=new int[n-1];
        int [] C=new int[n-2];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            B[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-2;i++){
            C[i]=sc.nextInt();
        }
      
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(B));
        for(int i=0;i<n-1;i++){
            if(A[i]!=B[i]){
              System.out.println(A[i]);
              break;
            }
        }
        for(int i=0;i<n-2;i++){
            if(C[i]!=B[i]){
              System.out.println(B[i]);
              break;
            }
        }
    }
}
