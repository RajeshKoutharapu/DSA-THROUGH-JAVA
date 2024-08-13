//leetcode Question number  5

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String s="aacabdkacaa";
        String max="";
       // int cout=0;
        for(int i=0;i<s.length()-1;i++){
          String odd=palid(s, i, i);
          String even=palid(s, i, i+1);
          if(odd.length()>even.length()){
           // max=Math.max(max,odd.length());
                  if(max.length()<odd.length()){
                    max=odd;
                  }
          }else{
            if(max.length()<even.length())
                 max=even;
          }
          
        }
        System.out.println(max);
    }

    static String palid(String s,int l,int r){
           
      while(l>=0 && r<s.length() &&  s.charAt(l)==s.charAt(r)){
        l--;
        r++;
      }
      return s.substring(l+1, r);
    }
}
