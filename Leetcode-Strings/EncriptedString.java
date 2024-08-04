//leetcode 3210
public class EncriptedString {
public static void main(String[] args) {
    String s="dart";
    int k=3;
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<s.length();i++){
        sb.append(s.charAt((i+k)%s.length()));
    }
System.out.println(sb);
}
}
