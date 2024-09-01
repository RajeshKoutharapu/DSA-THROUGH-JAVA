
//leetcode Question number 1624
public class LargestSubstring {
    
    public static void main(String[] args) {
        String s="aa";
        System.out.println(find(s));
    }

    static int find(String s){
        int largelength=0;
        int i=0;
        boolean b=false;
        for(char ch:s.toCharArray()){
            int temp=(s.lastIndexOf(ch)-i)-1;
            if(temp>=largelength){
            largelength=temp;
            b=true;
            }

            i++;
        }
        if(b)
          return largelength;
          else
           return -1;
    }
}
