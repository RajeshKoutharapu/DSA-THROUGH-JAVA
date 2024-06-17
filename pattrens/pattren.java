public class pattren {
    public static void main(String[] args) {
        pattren5(7);
    }
    static void pattren1(int n){
       for(int i=1;i<=2*n;i++){
        int columncount=i<n?i:2*n-i;
          int space=n-i;
          space=space<0?space*-1:space;
          for(int s=1;s<=space;s++){
            System.out.print(" ");
          }
          for(int j=1;j<=columncount;j++){
            System.out.print("*");
          }
          System.out.println();
       }
    }
    static void pattren2(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print(j);
        }
        System.out.println();
      }
    }
    static void pattren3(int n){
      for(int row=1;row<=n;row++){
        int space=n-row;
        for(int s=1;s<=space;s++){
          System.out.print(" ");
        }
        for(int col=1;col<=row;col++){
          System.out.print("* ");
        }
        System.out.println();
      }
    }
    static void pattren4(int n){
      int N=2*n;
      for(int row=1;row<=N;row++){
        int columncount=row>n?N-row:row;
        for(int col=1;col<=columncount;col++){
          System.out.print("*");
        }
        int space=N-row*2;
        space=space<0?space*-1:space;
        for(int s=1;s<=space;s++){
          System.out.print(" ");
        }
        for(int col1=1;col1<=columncount ;col1++){
        System.out.print("*");}
        System.out.println();
      }
    }
    static void pattren5(int n){
      for(int row=1;row<=n;row++){
        for(int col=1;col<=n;col++){ 
          int value=Math.min(Math.min(row, col),Math.min(1+n-row,1+n-col));
          System.out.print(value+" ");
        }
        System.out.println();
      }
    }
   
}

