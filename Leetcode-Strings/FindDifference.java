//letcode Question number  389

import java.util.Arrays;

public class FindDifference{
    public static void main(String[] args) {
        String s="adcd";
        String t="abcde";
         char[] ch=s.toCharArray();
        char []ch1=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch1[i]){
               System.out.println( ch1[i]);
               return ;
            }
        }
        System.out.println(ch1[ch1.length-1]);
    }
}