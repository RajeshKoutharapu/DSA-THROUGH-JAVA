//leetcode question  74
public class Searchin2DMatrix {
    public static void main(String[] args) {
          int [][]matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
          int target=3;
          int rl=matrix.length;
    int cl=matrix[0].length;
  for(int i=0;i<rl;i++){
    int s=0;
    int e=cl-1;
    while(s<=e){
        int mid=(s+e)/2;
        if(matrix[i][mid]==target){
          System.out.println(true);
          return ;
        }
          else if(matrix[i][mid]>target){
             e=mid-1;
          }else
              s=mid+1;
             
    }
  }
  System.out.println(false);
    }
}
