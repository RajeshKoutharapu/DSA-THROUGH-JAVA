public class sumofdigits {
    public static void main(String[] args) {
        int num=1325;
System.out.println(sumof(num));
    }
    static int sumof(int num){
        if(num==0)
          return 0;
  return (num%10)+sumof(num/10);
    }
}
