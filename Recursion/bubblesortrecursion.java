public class bubblesortrecursion {
  public static void main(String[] args) {
    int[] aa={4,6,1,3,7,};
   int [] jj= bbsort(aa,aa.length-1,0);
   for (int i : jj) {
    System.out.print(i);
   }
  }
  static int [] bbsort(int [] aa,int n,int j){
        
    if(n==0){
        return aa;
    }
    if(n>j){
        if(aa[j]>aa[j+1]){
            int temp=aa[j];
            aa[j]=aa[j+1];
            aa[j+1]=temp;
   }
        bbsort(aa, n, j+1);
    }else
       bbsort(aa, n-1, 0);
   
       return aa;
  }
}
