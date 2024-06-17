// leetcode Question number 1859
public class SortingSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        String [] ss=s.split(" ");
     //  System.out.println(ss.length);
        String [] res=new String[ss.length];
        int l=ss.length;
        for(int i=0;i<l;i++){
               //   System.out.println((int)ss[i].charAt(ss[i].length()-1));
            int index=ss[i].charAt(ss[i].length()-1)-'0';
          res[index-1]=ss[i].substring(0,ss[i].length()-1);
        }
        StringBuffer st =new StringBuffer();
        for(int i=0;i<res.length;i++){
            st.append(res[i]);
            if(i!=res.length-1)
                st.append(" ");
        }
       System.out.println(st);
    }
    
}
