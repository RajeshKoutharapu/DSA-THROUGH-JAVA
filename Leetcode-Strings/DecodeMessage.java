//leetcode Question number 2325

import java.util.HashMap;
import java.util.Map;

public class DecodeMessage {
      public static void main(String[] args) {

        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        StringBuffer s=new StringBuffer();
        int j=0;
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<key.length();i++)
        {  char ch=key.charAt(i);
            if(ch!=' '&&!map.containsKey(ch)){
                  map.put(ch,(char)('a'+j));
                  j++;
            }
        }
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
            s.append(" ");
            }else{
                s.append(map.get(message.charAt(i)));
            }
        }
        System.out.println(s);
      }
}
