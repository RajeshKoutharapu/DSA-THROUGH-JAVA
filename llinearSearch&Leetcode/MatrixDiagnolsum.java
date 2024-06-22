//leeetcode Question number 1572
public class MatrixDiagnolsum{
    public static void main(String[] args) {
           int [][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
             int n=mat.length;
             int sum=0,index=0;
           for(int i=0;i<n;i++){
              sum=sum+mat[i][i];
           }
          for(int i=n-1;i>=0;i--){
            sum=sum+mat[i][index];
              index++;
          }
          if(n%2!=0)
              sum=sum-mat[n/2][n/2];


              System.out.println(sum);
    }
}