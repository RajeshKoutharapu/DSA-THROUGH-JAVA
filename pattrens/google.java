import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class google{
public static void main(String[] args) {
    
    int n=25;
    
    int s=0;
    int  e=n;
     while(s<=e){
        int mid=(s+e)/2;
        if(mid*mid ==n)
           {
            System.out.println(mid);
            return ;
           }else if(mid*mid >n)
             e=mid-1;
             else
             s=mid+1;

     }
       System.out.println(s);
}
}