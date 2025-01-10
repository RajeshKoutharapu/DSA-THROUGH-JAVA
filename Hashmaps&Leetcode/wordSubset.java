//leetcode Question number 916

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class wordSubset {
    public static void main(String[] args) {
         String [] word1={"amazon","apple","facebook","google","leetcode"};
         String [] word2={"lo","eo"};
        int [] tempfreq=new int[26];
        int [] maxfreq=new int[26];
        List<String> result=new ArrayList<>();
        for(String s:word2){
            Arrays.fill(tempfreq, 0);
            for(char c:s.toCharArray()){
                tempfreq[c-'a']++;
            }
            for(char c:s.toCharArray())
            {
                maxfreq[c-'a']=Math.max(maxfreq[c-'a'],tempfreq[c-'a']);
            }
        }
        System.out.println(Arrays.toString(maxfreq));
        for(String s:word1){
             Arrays.fill(tempfreq,0);
            for(char c:s.toCharArray())
            {
                tempfreq[c-'a']++;
            }
            boolean check=true;
            for(int i=1;i<26;i++){
                if(tempfreq[i] < maxfreq[i]){
                    check=false;
                    break;
                }
                   
            }

            if(check)
                result.add(s);
               
        }
        System.out.println(result);
    }
}
