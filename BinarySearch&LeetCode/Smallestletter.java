
//link of leetcode//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class Smallestletter {
    public static void main(String[] args) {
        char [] letter={'a','b','c','f'};
        char target='e';
      System.out.println(m1(letter, target));
      System.out.println("hello ");
    }
    
    public  static char  m1(char[]letter,char c){

    int start=0;
    int end=letter.length-1;
    while (start<=end) {
        int mid=(start+end)/2;
        if(c<letter[mid]){
            end=mid-1;
        }else{
          start=mid+1;
        }
        
    }

        return letter[start % letter.length];
    }
    
}
