//leetcode Question number 

import java.util.ArrayList;
import java.util.List;

public class StringMatchinhArray {
    public static void main(String[] args) {
        String [] words={"leetcode","et","code"};

         List<String> result=new ArrayList<>();
         for(int j=0;j<words.length;j++){
            for(int i=0;i<words.length;i++){
                if(i!=j){
                if(words[i].indexOf(words[j])>-1)
                   {
                    result.add(words[j]);
                    break;
                   }
                }
                           
            }
        }
        System.out.println(result);
    }
}
