// leetcode 541
public class ReverseString1 {
    public static void main(String[] args) {

        String s="abcdefg";
        int k=2;
        StringBuffer sb=new StringBuffer();
        sb.append(s.substring(0,k));
       sb= sb.reverse();
       sb.append(s.substring(k,s.length()));
       System.out.println(sb);
    }
}
