//leetcode Question number 345

import java.util.Arrays;

public class ReverseVoels {
     public static void main(String[] args) {
        String s="Ui";
        char ch[]=s.toCharArray();
        int st=0;
        int en=ch.length-1;
         while (st<en) {
            if(ch[st]=='a'||ch[st]=='e'||ch[st]=='i'||ch[st]=='o'||ch[st]=='u'||ch[st]=='A'||ch[st]=='E'||ch[st]=='I'||ch[st]=='O'||ch[st]==
            'U'){
                if(ch[en]=='a'||ch[en]=='e'||ch[en]=='i'||ch[en]=='o'||ch[en]=='u'||ch[en]=='A'||ch[en]=='E'||ch[en]=='I'||ch[en]=='O'||ch[en]==
                'O'){
                           char temp=ch[st];
                           ch[st]=ch[en];
                           ch[en]=temp;
                           st++;
                           en--;
                }
                else
                  en--;
            }
            else
              st++;
          }
         String  res=new String(ch);
          System.out.println(res);
     }
}
