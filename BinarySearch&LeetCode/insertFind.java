//leetcode Question number 45
public class insertFind {
    public static void main(String[] args) {
        int [] nums={2,3,5,7};
        int target=6;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) System.out.println(mid);
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        System.out.println(start) ;
    }
}
