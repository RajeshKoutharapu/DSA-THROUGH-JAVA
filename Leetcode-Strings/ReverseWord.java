//leet code Question number 151
public class ReverseWord {
    public static void main(String[] args) {
        String s="  hello world  ";
          String ss="";
        s=s.replaceAll("( )+"," ").trim();
        String [] s1=s.split(" ");
        
        for(int i=s1.length-1;i>=0;i--)
        {
             ss+=s1[i];
            ss+=" ";
        }
        System.out.println(ss.trim());
    }
    
}
