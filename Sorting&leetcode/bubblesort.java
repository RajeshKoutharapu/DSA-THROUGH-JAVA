
//import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr={5,7,1,9,4};
        boolean swap=true;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                    int a=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=a;
                    swap=false;
                 }
         }
                 if(swap){
                    break;
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
        }
  
    }

