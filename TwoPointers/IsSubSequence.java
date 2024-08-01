//leetcode Question 392
public class IsSubSequence {

     public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        if(s.equals(null)){
       System.out.println(false);
        }

     int it=0;
     int c=0;
     for(int i=0;i<t.length();i++){
         if(it==s.length())
               break;
         if(t.charAt(i)==s.charAt(it)){
             it++;
             c++;
         }
     }
     if(c==s.length())
      System.out.println(true);
       else
        System.out.println(false);
     }
}