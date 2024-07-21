import java.util.Scanner;

public class codetantra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0&&n%7==0){
            System.out.println("fly");
        }else
          System.out.println("cannot fly");
    }
}
