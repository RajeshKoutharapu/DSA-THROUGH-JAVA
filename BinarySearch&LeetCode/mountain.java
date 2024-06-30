/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 ///https://leetcode.com/problems/find-in-mountain-array/
//  class Solution {
//     public int findInMountainArray(int target, MountainArray mountainArr) {
//       int peek=Findpeek(mountainArr);
//       int res=result(mountainArr,0,peek,target);
//       if(res!=-1){
//           return res;
//       }else{
//             int res1=result(mountainArr,peek,mountainArr.length()-1,target);
//             return res1;
//       }

        
//     }
//     public int Findpeek(MountainArray  mountainArr){
//     int start=0;
//     int end=mountainArr.length()-1;
//     while(start<end){
//         int mid=(start+end)/2;
//         if(mountainArr.get(mid)>mountainArr.get(mid+1)){
//             end=mid;
//         }else{
//             start=mid+1;
//         }
//     }
//     return start;
//     }

//     public int result(MountainArray  arr,int start,int end,int target){
//         boolean bb=arr.get(start)<arr.get(end);
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(arr.get(mid)==target){
//                 return mid;
//             }
//             if(bb){
//             if(arr.get(mid)<target){
//                 start=mid+1;
//             }else if(arr.get(mid)>target){
//                 end=mid-1;
//             }else{
//                 return mid;
//             }
//             }
//             else{
//                  if(arr.get(mid)<target){
//                      end =mid-1;
//             }else if(arr.get(mid)>target){
//                 start=mid+1;
//             }else{
//                 return mid;
//             }

//             }
//         }
//   return -1;
//     }
// }



