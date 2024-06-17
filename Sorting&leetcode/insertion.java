
//package Sorting;

import java.util.Arrays;

public class insertion{
    public static void main(String[] args) {
        int [] arr={5,7,2,0,9};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]<arr[j]){
                    int a=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=a;
                    }
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
