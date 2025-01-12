//leetcode question number 2116
public class PranthesisStringcanbevalid {
    public static void main(String[] args) {
        
       String s = "))()))";
        String locked = "010100";
        if(s.length()%2!=0)
      System.out.println("false");
  int count=0;
  char [] ch=s.toCharArray();
  char [] val=locked.toCharArray();
  for(int i=0;i<ch.length;i++){
      if(ch[i]=='(' || val[i]=='0')
       count++;
       else{
          count--;
          if(count<0)
          System.out.println(false);

       }
  }
  count=0;
  for(int i=ch.length-1;i>=0;i--){
      if(ch[i]==')' || val[i]=='0')
       count++;
       else{
          count--;
          if(count<0)
          System.out.println(false);

       }
  }

 System.out.println(false);

    }
}
