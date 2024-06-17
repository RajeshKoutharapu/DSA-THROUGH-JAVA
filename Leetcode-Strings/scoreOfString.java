 

public class scoreOfString {
    public static void main(String[] args) {
        String s="hello";
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
             int c=(int)s.charAt(i);
             int c1=(int)s.charAt(i+1);
             System.out.println(c+" "+c1);
             int temp=c-c1;
            if(temp<0){
                temp=temp*-1;
            }
             sum=sum+temp;
             System.out.println(sum);
        }
    }
    
}