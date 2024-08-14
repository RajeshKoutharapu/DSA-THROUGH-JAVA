public class Xpattren {
    public static void main(String[] args) {
        int n=6;
        int [][] mat=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || j+i==n-1)
                      System.out.print("X");
            else
              System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
