package BinarySearch;
public class binarySearch {
    public static void main(String[] args) {
        int [] aa={9,8,7,6,5,4,3,2};
        int target=4;
           System.out.println(Search(aa,target));
    }
    public static int Search(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean bl=arr[start]<=arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            if(bl){
            if(target<arr[mid]){
            end=mid-1;
            }else{
                start=mid+1;
            }
            }else{
                if(target>arr[mid]){
           end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return -1;

    }
    
}
