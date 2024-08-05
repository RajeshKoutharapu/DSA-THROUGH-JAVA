
// leetcode Question number 1423
public class MinimumPointsFromCards {
    public static void main(String[] args) {
        int [] cardPoints={1,2,3,4,5,6,1};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        if(k==cardPoints.length)
           {
            System.out.println(sum);
            return;
           }
        int cursum=sum;
       int r=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            sum-=cardPoints[i];
            sum+=cardPoints[r];
          if(sum>cursum){
            cursum=sum;
          }
          r--;
        }
    System.out.println(cursum);
    }
}
