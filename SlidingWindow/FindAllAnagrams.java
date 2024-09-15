//leetcode Question number 348

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        String  s = "cbaebabacb";
        String  p = "abc";
        List<Integer> list=new ArrayList<>();
        int k=p.length();
         char [] ch=p.toCharArray();
         Arrays.sort(ch);
         String t=String.copyValueOf(ch);
         char ss[]=s.toCharArray();
         for(int i=0;i<=ss.length-k;i++){
          char [] check=new char[k];
           for(int j=0;j<k;j++){
               check[j]=ss[i+j];
           }
            Arrays.sort(check);
                 if(t.equals(String.copyValueOf(check)))
                     list.add(i);
         }
         System.out.println(list);
    }
}
