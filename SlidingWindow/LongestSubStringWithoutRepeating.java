//leetcode Question number  5

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String s="jbpnbwwd";
         int max=0;
        int cout=0;
       // int in=0;
      List<Character> list=new ArrayList<>();
      for(char c:s.toCharArray()){
        if(list.contains(c)){
             list.subList(0,list.indexOf(c)+1).clear();
             list.add(c);
             //c--;
             if(max<cout){
               max=cout;
           //    cout=list.size();
             }
             cout=list.size();
        }else{
            list.add(c);
            cout++;
        }
      }
     System.out.println((cout>max)?cout: max);
    }
}
