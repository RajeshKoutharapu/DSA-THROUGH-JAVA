// leeetcod eQuestion number 
public class MergerString {
    public static void main(String[] args) {
        String word1="abc";
        String word2="pqr";
        int p1=0;
        int p2=0;
        StringBuffer sb=new StringBuffer();
        while(p1<word1.length() && p2< word2.length()){
            sb.append(word1.charAt(p1));
            sb.append(word2.charAt(p2));
            p1++;
            p2++;
        }
        //if(p1<word1.length()){
            sb.append(word1.substring(p1,word1.length()));
       // }
       // if(p2<word2.length()){
            sb.append(word2.substring(p2,word2.length()));
       // }
        System.out.println(sb);
    }
}
