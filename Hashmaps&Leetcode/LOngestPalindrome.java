//leetcode Question number 409

import java.util.HashMap;
import java.util.Map;

public class LOngestPalindrome {
    public static void main(String[] args) {
        String s="abccccdd";
        int od=0;
        int res=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Integer n:map.values()){
            if(n%2!=0)
            {
              od=Math.max(od,n);
            }else
              res+=n;
              
        }
        System.out.println(od+res);
    }
}
