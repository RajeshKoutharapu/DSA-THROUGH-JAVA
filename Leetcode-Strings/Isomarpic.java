import java.util.Scanner;

public class Isomarpic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int map1[]=new int[200];
        int map2[]=new int[200];

        if(s.length()!=t.length()){
            System.out.println(false);
            return ;

        }


        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)]){
            System.out.println(false);
            return ;
            }

            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        System.out.println(true);
    }
}
