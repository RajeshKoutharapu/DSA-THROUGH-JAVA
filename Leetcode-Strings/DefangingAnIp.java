
//leet code url https://leetcode.com/problems/defanging-an-ip-address/description/
// question number 1108
public class DefangingAnIp {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        StringBuffer st=new StringBuffer();
      //  String temp=null;
            for(int i=0;i<address.length();i++){
                if(address.charAt(i)=='.'){
                   st.append("[.]");
                }else
               
               st.append(address.charAt(i));
            }
           
        System.out.println(st.toString());
    }
}
