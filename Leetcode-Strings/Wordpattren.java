//leetcode Question 290

//import java.sql.Struct;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Wordpattren {
     public static void main(String[] args) {
      System.out.println((-1+0)%5);
        String pattern = "abba";
        String s = "dog dog cat fish";
        String ar[]=s.split(" ");
        Map<Character,String> map=new HashMap<>();
        if(pattern.length()!=ar.length)
           System.out.println("false");
        else{
            for(int i=0;i<pattern.length();i++){
                    char c=pattern.charAt(i);
            if(map.containsKey(c)){
                 if(!map.get(c).equals(ar[i]))
                    System.out.println("false");
            }else{
                if(map.containsValue(ar[i]))
                   System.out.println(false);
                   else
                      map.put(c,ar[i]);

            }
        }
        }
        System.out.println(true);
     }
}
