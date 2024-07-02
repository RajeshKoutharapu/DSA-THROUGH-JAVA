//leetcod eQuestion nuber 2000
public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        StringBuffer s=new StringBuffer();
        char ch = 'd';
        int index=word.indexOf(ch);
       for(int i=index;i>=0;i--){
            s.append(word.charAt(i));
       }
       for(int i=index+1;i<word.length();i++){
        s.append(word.charAt(i));
   }
System.out.println(s);
}
}
