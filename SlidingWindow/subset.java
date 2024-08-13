import java.util.*;
public class subset
{
	public static void main(String[] args) {
	    int[]  arr ={2,1,-2,-5,-2};
	    int fialsum=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            int sum=0;
            ArrayList<Integer> Arr =  new ArrayList<>();
            for (int j =i;j<arr.length;j++)
                {
                    sum+=arr[j];
                    Arr.add(arr[j]);
                    fialsum=Math.max(fialsum,sum);
                }
            Collections.sort(Arr);
            sum=sum-Arr.get(0);
            System.out.println("sum = "+sum);
            fialsum=Math.max(fialsum,sum);
        }
        System.out.println(fialsum);
		
	}
}