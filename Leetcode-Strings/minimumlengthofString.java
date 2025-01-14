public class minimumlengthofString {
public static void main(String[] args) {
    String s="abaacbcbb";
    int [] count=new int[26];
    s=s.toLowerCase();
    int result=0;
    for(char c:s.toCharArray()){
        count[c-'a']++;

    }
    for(int i=0;i<26;i++){
        if(count[i]==0)
         continue;
        if(count[i]%2==0)
           result+=2;
          
            else
              result+=1;
    }
    System.out.println(result);
}
    
}