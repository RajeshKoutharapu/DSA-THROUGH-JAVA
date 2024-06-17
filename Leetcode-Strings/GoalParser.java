
// leet code Question number : 1678
public class GoalParser {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        StringBuilder S = new StringBuilder(command.length());
        for(int i = 0 ; i < command.length() ; i++){
            if(command.charAt(i)=='G') S.append('G');
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')') {S.append('o'); i++;}
                else{S.append("al"); i = i + 3;}
            }
        }
         System.out.println(S.toString());
    }
    
}
