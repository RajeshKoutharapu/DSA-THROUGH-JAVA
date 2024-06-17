package llinearSearch;

public class evenDigitcount {
    
    public static void main(String[] args) {
        int [] array={12,3,567,8907,23};//out put must be "3" coz numbers having even no.of digits are 3
    System.out.println(even(array));
    }
  public static int even(int [] ar){
int count=0;
    for (int i : ar) {
        if(count(i)){
         count++;
        } }
    return count;

  }
  public static boolean count(int i){
    int count=0;
    while (i>0) {
        count++;
        i=i/10;
     }
    return count%2==0;//return true if conditionn is true
  }
  }
