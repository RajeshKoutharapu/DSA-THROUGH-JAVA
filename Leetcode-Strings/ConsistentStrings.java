//leetcode Question umber 1684
public class ConsistentStrings {
    public static void main(String[] args) {
       String  allowed = "ab";
       String [] words = {"ab","bd","aaab","baa","badab"};
       int check[]=new int[26];
  //int in=0;
  int count=0;
  boolean b=true;
       for(char c:allowed.toCharArray()){
             check[c-'a']=1;
       }


       for(String s:words){
         for(int i=0;i<s.length();i++){
            if(check[s.charAt(i)-'a']==0){
                  b=false;
                  break;
            }

         }
         if (b) {
             count++;
            }
              else
                 b=true;
       }

       System.out.println(count);
    }
}
