//leetcode question number 2000
public class ReversePrefixString {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer();
        String word = "abcdefd";
        char ch = 'd';
           int index=word.indexOf(ch);
          for(int i=index;i>=0;i--){
               s.append(word.charAt(i));
          }
          for(int i=index+1;i<word.length();i++){
           s.append(word.charAt(i));
      }
   System.out.println(s.toString());
    }
}
