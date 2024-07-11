//leetcode Question 2129
public class CapitalizeTitle {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        title=title.toLowerCase();
        String []s=title.split("\\s");
        StringBuffer sb=new StringBuffer();
         for(int i=0;i<s.length;i++){
            if(s[i].length()<=2){
                 if(i==s.length-1)
               sb.append(s[i]);
               else
            sb.append(s[i]+" ");
            }
             else{
               s[i]=s[i].toLowerCase();
                sb.append(Character.toTitleCase(s[i].charAt(0)));
               String w = s[i].substring(1);
               if(i==s.length-1)
               sb.append(w);
               else
                sb.append(w+" ");
               
             }
        }
        System.out.println(sb);
    }
}
