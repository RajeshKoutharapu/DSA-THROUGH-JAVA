public class RobotReturn {
    public static void main(String[] args) {
        String moves = "LL";
        int i=0;
        int j=0;
        for(int t=0;t<moves.length();t++){
            char c=moves.charAt(t);
            if(c=='R'){
                j++;
            }else  if(c=='L'){
                 j--;
            }else if(c=='U'){
                i--;
            }else
               i++;
        }
        if(i==0 && j==0){
            System.out.println(true);
        }else
       System.out.println(false);
    }
}
