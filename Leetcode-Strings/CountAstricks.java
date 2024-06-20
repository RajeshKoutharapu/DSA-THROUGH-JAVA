public class CountAstricks {
    public static void main(String[] args) {
    String s = "l|*e*et|c**o|*de|";
        String [] res=s.split("\\|");
        int count=0;
        for(int i=0;i<res.length;i=i+2){
            String ss=res[i];
              int temp=ss.length();
                   for(int j=0;j<temp;j++){
                         if(ss.charAt(j)=='*')
                              count++;
                   }
        }
        System.out.println("count of astricks :"+count);
    }
}
