//leetcode Question number 3

import java.util.ArrayList;
import java.util.List;

public class Longestsubstring {
      public static void main(String[] args) {
        String  s = "pwwkew";
        int max=0;
        int cout=0;
      List<Character> list=new ArrayList<>();
      for(char c:s.toCharArray()){
        if(list.contains(c)){
             list.clear();
             list.add(c);
             if(max<cout){
               max=cout;
               cout=1;
             }
        }else{
            list.add(c);
            cout++;
        }
      }
      System.out.println(max);
        
      }
}
