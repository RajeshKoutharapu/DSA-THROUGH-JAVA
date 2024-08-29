//leetcode Question number 1324

import java.util.ArrayList;
import java.util.List;

public class PrintWordsvertically {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        String  s = "CONTEST IS COMING";
        String [] ss=s.split(" ");

        // for(int i=0;i<ss.length;i++){
        //     list.add(String.valueOf(ss[i].charAt(0)));
        // }
          int k=0;
        int max=0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<ss.length;i++){
            if(max<ss[i].length()){
               max=ss[i].length();
            }
        }
        for(int i=0;i<max;i++){
              for (String string : ss) {
                if(k>string.length()-1)
                    {
                    sb.append(" ");
                    }else
                   sb.append(string.charAt(k));
              }
              list.add(sb.toString().stripTrailing());
              sb.delete(0, sb.length());
             // c++;
              k++;
        }
  System.out.println(list);
    }
}
