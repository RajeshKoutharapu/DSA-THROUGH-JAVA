import java.util.ArrayList;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n =scan.nextInt();
        ArrayList<Integer> Arr =new ArrayList<>();
        for (int i =0;i<=n;i++)
        {
            Arr.add(i);
        }
        int l =0;
        int h =Arr.size()-1;
        int flag =1;
        while (l<=h) 
        {
            int mid= h+l/2;
            if(((Arr.get(mid))*(Arr.get(mid)))>n)
            {
                h=mid-1;
            }
            else if (((Arr.get(mid))*(Arr.get(mid)))<n)
            {
                l=mid+1;
            }
            else
            {
                flag=0;
            }
        }
        if (flag!=0)
        {
            System.out.println("Sqrt Not Present");
        }
        else{
            System.out.println("hii");
        }
    }
}
