import java.util.Scanner;

public class NbaseNotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        String s="0123456789ABCDEFGHIJKLMONPQRSTUVWXYZ";
        char []ch=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        while (num>0) {
             int temp=num%n;
            sb.append(ch[temp]);
            num/=n;
        }
       System.out.println(sb.reverse());
    }
}
