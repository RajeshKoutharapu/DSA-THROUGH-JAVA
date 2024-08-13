import java.util.Arrays;
import java.util.Scanner;

public class Alternate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int t[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=0;
        int e=n-1;
        int in=0;
        while (s <= e) {
            t[in++] = arr[e--];
            if (s <= e) {
                t[in++] = arr[s++];
            }
        }
      
             for (int i : t) {
                System.out.print(i+" ");
             }
    }
}
