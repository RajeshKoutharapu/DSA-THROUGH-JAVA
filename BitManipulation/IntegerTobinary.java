public class IntegerTobinary {
    public static void main(String[] args) {
      //  System.out.println(02)
      int n=13;
    StringBuffer sb=new StringBuffer();
    while(n>0){
        if(n%2==0)
          sb.append(0);
          else
            sb.append(1);

            n=n/2;
    }
    System.out.println(sb.reverse());
    //binary to integer
    String s=sb.toString();
        int res=0;
    for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)=='1'){
           res+=(int) Math.pow(2,s.length()-1-i);
        }
    }
    System.out.println(res);
 }
}
