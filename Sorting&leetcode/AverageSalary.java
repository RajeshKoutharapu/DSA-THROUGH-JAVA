import java.util.Arrays;
//leetcode Question number 1491
public class AverageSalary {
    public static void main(String[] args) {
        int [] salary = {4000,3000,1000,2000};
          Arrays.sort(salary);
       Long temp=0L;
        for(int i=1;i<salary.length-1;i++){
           temp=temp+salary[i];
        }
        double d=temp/(salary.length-2);
        System.out.println(d);
    }
    
}
