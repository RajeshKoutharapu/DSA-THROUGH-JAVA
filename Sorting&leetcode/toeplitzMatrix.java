//leetcode Question number 766
public class toeplitzMatrix {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int rl=matrix.length;
          int cl=matrix[0].length;
              
          int i=matrix.length-2;
          int t1=0;
          
          if(rl<=1 || cl<=1)
          System.out.println(true);
          for(int r=0;r<(rl+cl)-3;r++){
          for(int t=i;t<matrix.length-1;t++){
              if(matrix[t][t1]!=matrix[t+1][t1+1])
              
                   System.out.println(false);
                      
          }
          if(i>0){
             i--;
          }else
             t1++;
        }
      System.out.println(true);
    }
}
