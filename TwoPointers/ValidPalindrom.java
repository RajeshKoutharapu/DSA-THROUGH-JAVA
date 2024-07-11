//leetcodeQuestion  125
public class ValidPalindrom {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) ||Character.isDigit(s.charAt(i))){
             sb.append(s.charAt(i));
            }
        }
         String ss=""+sb;
         ss=ss.toLowerCase();
       // System.out.println(ss);
 
 
        int l=0;
        int h=ss.length()-1;
     //      if(ss.length()<2){
     //       return false;
     //    }else{
        while(l<h){
         if(ss.charAt(l)==ss.charAt(h)){
             l++;
             h--;
         }else{
            System.out.println(false);
             break;
         }
        }
        //}
        System.out.println(true);
    }
}
