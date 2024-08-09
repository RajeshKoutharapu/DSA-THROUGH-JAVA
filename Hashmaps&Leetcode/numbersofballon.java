import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class numbersofballon {
    public static void main(String[] args) {
        String text ="balon";
        List<Integer> list=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();

          for(Character c:text.toCharArray()){

            if(map.containsKey(c)){
                   // if(c=='l' || c=='o'){
                          //  if(map.get(c)%2!=0)
                           //  map.put(c,map.get(c)+1);
                   // }else
                   // {
                        map.put(c,map.get(c)+1);
                   // }
            }else{
            if(c=='b')
                  map.put(c,1);
            else if(c=='a')
                map.put(c,1);
                 else if(c=='l')
                map.put(c,1);
                 else if(c=='o')
                map.put(c,1);
                 else if(c=='n')
                map.put(c,1);
                // else if(c=='a')
               // map.put(c,map.getOrDefault(c,1)+1);

            }
          }
          for(Map.Entry<Character,Integer> en:map.entrySet()){
            if(en.getKey()=='l' || en.getKey()=='o'){
                if(en.getValue()/2==0)
                list.add(0);
                else
                list.add(en.getValue()/2);
            }else
            list.add(en.getValue());
          }

          if(list.size()<5 ||list.contains(-1))
          System.out.println(0);
          else
          System.out.println(Collections.min(list));
}
}