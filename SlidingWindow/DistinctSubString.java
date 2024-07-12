//leetcode 1876



public class DistinctSubString {
    public static void main(String[] args) {
        String  s = "xyzzaz";
        int k=3;
        int count=0;
        char [] ch=s.toCharArray();
   // Set<Character> set=new HashSet<>();
        for(int i=0;i<ch.length-k+1;i++){
            if(ch[i]!=ch[i+1]&&ch[i]!=ch[i+2]&&ch[i+1]!=ch[i+2])
                 count++;
        }
        System.out.println(count);
        }
    
}
