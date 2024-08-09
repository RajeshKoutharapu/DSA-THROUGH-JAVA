//leetcode Question number 1475

import java.util.Arrays;

public class FinalPriceDiscount {
    public static void main(String[] args) {
        int [] prices={8,4,6,2,3};

        int i=0;
        int j=1;
        while(i<prices.length-1){
            if(prices[i]>prices[j]){
                prices[i]=prices[i]-prices[j];
                i++;
                j=i+1;
            }else if(j<prices.length-1)
                     j++;
            else
              {
                i++;
                j=i+1;
              }
        }
        System.out.println(Arrays.toString(prices));
    }
}
