
// leetcod eQuestion number 395

import java.util.HashMap;
import java.util.Map;

public class SubstringWithKrepet {
    public static void main(String[] args) {
          String s="aaabbb";
          int k=3;
          int c=1,mc=0;
          boolean [] b=new boolean[s.length()];
          char[] ch=s.toCharArray();
          Map<Character,Integer> map=new HashMap<>();
          for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1); 
            }
            //System.out.println(map);
            for(int i=0;i<ch.length;i++){
                if(map.get(ch[i])<k)
                   b[i]=true;
            }

            for(int i=0;i<b.length;i++){
                if(b[i]==true)
                     c=0;

                 mc=Math.max(mc, c);
                 c++;
            }
            System.out.println(mc);
          }
        
    }

