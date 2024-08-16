//leetcode Question number  205

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class isomarphicString {
    public static void main(String[] args) {
        
        String s="paper";
        String t="title";
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();
       // List.add<

        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c:t.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }

        if(map.size()!=map1.size())
          {
            System.out.println(false);
            return  ;

          }
         for(Character cc:map.keySet()){
              if(map1.containsValue(map.get(cc))){
              //  map.remove(cc);
              }else
                 {
                    System.out.println(false);
                    return ;
                 }
         }
  System.out.println(true);
    }
}
