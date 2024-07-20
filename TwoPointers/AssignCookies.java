//leetcode 455
public class AssignCookies {
    public static void main(String[] args) {
        int [] g={1,2,3};
        int []s={1,1};
        int p1=0,count=0;
        int p2=0;
        while(p1<g.length-1&&p2<s.length){
           if(g[p1]<=s[p2]){
             count++;
             p2++;
             p1++;
           }else{
            p1++;
           }
        }
        System.out.println(count);
    }
}
