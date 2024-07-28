//leetcode Qno 1886

import java.util.Arrays;

public class RigthRotate {
    public static void main(String[] args) {
       
        int [][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int target[][]={{1,1,1},{0,1,0},{0,0,0}};
        int n=mat.length;
        // for(int p1=0;p1<n;p1++){
        //     for(int q=0;q<n;q++){
        //        System.out.print(mat[p1][q]);
        //     }
        //     System.out.println();
        // }
      
        
        int in=0;
        boolean b=true;
        int [] [] res=new int[n][n];
        for(int it=1;it<=3;it++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    //int temp=mat[n-i-1][j];
                   res[in][j]=mat[i][n-j-1];
                   
                }
            in++;
            }
            // for(int p1=0;p1<n;p1++){
            //     for(int q=0;q<n;q++){
            //        System.out.print(res[p1][q]);
            //     }
            //     System.out.println();
            // }
          in=0;
            for(int p=0;p<n;p++){
                for(int q=0;q<n;q++){
                   if( res[p][q]!=target[p][q])
                        b=false;
                     }
            }
            if(b){
               System.out.println(true);
                break;
            }
        }
       System.out.println(false);
    }
}

