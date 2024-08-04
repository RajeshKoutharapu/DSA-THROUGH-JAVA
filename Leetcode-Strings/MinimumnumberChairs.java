//leetcode Question number  3168
public class MinimumnumberChairs {
    public static void main(String[] args) {
        String s="EEFEFFEF";
        int count=0;
        int max=0;
        for(char chs:s.toCharArray()){
        if(chs=='E')
          count++;
          else
            count--;

            max=Math.max(count, max);
        }
        System.out.println(max);
      //  System.out.println(Math.max(10,10));
    }
}
