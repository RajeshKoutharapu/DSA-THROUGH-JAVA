//leetcode Question number 1813
public class SentenceSimilarity3 {
    public static void main(String[] args) {
        String s1="My name is Haley";
        String s2="My Haley u";
        if(s1.length()>s2.length())
              System.out.println( find(s1, s2));
           else
             System.out.println(   find(s2, s1));
          
    }
    static boolean find(String s1,String s2){
        String as1[]=s1.split(" ");
        String as2[]=s2.split(" ");
        if(s2.length()==1){
            if(as1[0].equals(s2)||as1[as1.length-1].equals(s2))
               return true;
        }
        for(String s:as2){
            if(!s1.contains(s))
               return false;
        }
 int [] check=new int[as1.length];
     for(int i=0;i<as1.length;i++){
          if(s2.contains(as1[i]))
             check[i]=1;
     }
     for(int i=1;i<check.length-1;i++){
           if(check[i-1]==0 && check[i]==1 && check[i+1]==0)
              return false;
     }

        return true;
    }
}
