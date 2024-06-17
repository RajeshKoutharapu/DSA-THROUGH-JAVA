public class Reversenumber {
    public static void main(String[] args) {
        int num=25467;
        System.out.println(rev(num,0));
    }
  //  static int res;
    static int rev(int num,int res){

if  (num==0)
return res;
   res=res*10+num%10;
      return  rev(num/10,res);
    }
}
