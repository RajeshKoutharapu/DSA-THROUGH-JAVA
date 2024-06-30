//leetcode Question number 441
public class ArrangingCoins {
    public static void main(String[] args) {
        int n=5;
        int t1=3;
        int t2=3;
        int mis=1;
        if(n==1)
          System.out.println(0);

          while (n>t1) {
            t1=t1+t2;
            t2++;
            mis++;
          }
          if(n==t1){
            System.out.println(0);
          }else
          System.out.println(mis);
    }
}