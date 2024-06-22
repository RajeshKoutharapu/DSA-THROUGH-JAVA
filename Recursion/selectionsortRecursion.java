public class selectionsortRecursion{
    public static void main(String[] args) {
        int [] a={3,5,1,88,4 };
          int []aa=selection(a,a.length-1);
for (int i : aa) {
    System.out.print(" "+i);
    
}
        }

        static int[] selection(int [] a,int n){
            if(n==0)
                 return a;
            else{
               int max= max(a,n);
                 int temp=a[n];
                 a[n]=a[max];
                 a[max]=temp;
               selection(a, n-1);  
            }
        return a;
        }
        static int max(int [] a,int n){
            int max=0;
    for(int i=0;i<=n;i++){
        if(a[max]<a[i]){
            max=i;
        }
    }
    return max;
        }
}