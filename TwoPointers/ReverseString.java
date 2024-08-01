//leetcode Question number 244
public class ReverseString {
    public static void main(String[] args) {
        char []s = {'h','e','l','l','o'};
        int l=0;
        int h=s.length-1;
        while(l<h){
            char temp=s[l];
            s[l]=s[h];
            s[h]=temp;
            l++;
            h--;
        }
        System.out.println(s);
     //   System.out.print(Arrays.toString(s));
    }
}
