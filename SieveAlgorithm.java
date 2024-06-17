import java.util.Scanner;

public class SieveAlgorithm {
    
    public static void main(String[] args) {
        System.out.println("enter the range");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        boolean [] res=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(res[i]==false){
               
                for(int j=i*2;j<=n;j+=i){
                      res[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
             if(res[i]==false){
                System.out.println(i+" is  prime");
            }
        }
    }
}
