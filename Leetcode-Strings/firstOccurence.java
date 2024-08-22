// leetcode Question number 
public class firstOccurence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int t=haystack.indexOf(needle);
        if(t>=0)
          System.out.println(t);
           else
           System.out.println(-1);
    }
}
