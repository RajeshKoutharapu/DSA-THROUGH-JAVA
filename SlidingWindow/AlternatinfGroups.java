//leetcode Question number 3206
public class AlternatinfGroups {
    public static void main(String[] args) {
        int [] c={0,1,0,0,1};
        int n=c.length;
        int res=0;
         for(int i=0;i<n;i++){
             if(c[i%n]==c[(i+2)%n] && c[i%n]!=c[(i+1)%n])
                 res++;
         }
         System.out.println(res);

    }
}
