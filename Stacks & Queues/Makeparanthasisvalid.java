import java.util.Stack;

public class Makeparanthasisvalid {
    public static void main(String[] args) {
        String s = "()";
    Stack<Character> stack=new Stack<>();
    for(char c:s.toCharArray()){
        if(c=='(')
           stack.push(c);
           else{
              if(stack.peek()=='('){
                    stack.pop();
              }else
                 stack.push(c);
           }
    }
    if(stack.size()!=0)
    System.out.println(stack.size());
    else 
    System.out.println(0);

}
    
}
