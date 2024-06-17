
// leetcod equestion number 1342
public class reducenumbertozero {
    public static void main(String[] args) {

        int num=20;
        System.out.println(helper(num, 0));
        
    }
    static int helper(int n,int c){
        if(n==0)
         return c;    

         if(n%2==0)
          return helper(n/2,c+1);
          else
           return helper(n-1,c+1);
 }
}
