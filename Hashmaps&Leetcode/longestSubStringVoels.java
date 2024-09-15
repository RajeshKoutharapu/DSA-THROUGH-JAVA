//leet code Question number 1371

import java.util.HashMap;
import java.util.Map;

public class longestSubStringVoels {
    public static void main(String[] args) {
        String s = "leetcodeisgreat";
        boolean bool=true;
        int len=0;
        s=s.toLowerCase();
        Map<Character,Integer> map=new HashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
        for(int j=i;j<ch.length;j++){
                bool=true;
                if(ch[j]=='a' ||ch[j]=='e' ||ch[j]=='o' ||ch[j]=='i' ||ch[j]=='u'){
                  map.put(ch[j], map.getOrDefault(ch[j], 0)+1);
                }
                  for(Integer in:map.values()){
                    if(in%2!=0){
                        bool=false;
                       // break;
                    }
                }
                if(bool)
                  len=Math.max(len,(j-i)+1);
              }
            map.clear();
        }
        System.out.println(len);
       
    }
}
