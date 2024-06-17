// leetcode Question 1694
public class Reformatnumber {
    public static void main(String[] args) {
        String number="22-666_990-9";
        number =number.replace("-","");
        number =number.replace("_","");
        number =number.replace("/","");
        System.out.println(number);
        String res="";
        while(number.length()>0){
             // int l=  number.length();
            if(number.length()<4){
               res +=number;
               number="";
            }else if(number.length()==4){
                res +=number.substring(0, 2);
                res+="-";
                number =number.substring(2);
            }else if(number.length()>4){
                     res +=number.substring(0,3);
                     res+="-";
                     number =number.substring(3);
            }
        }
        System.out.println(res);

    }
    
}
