import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{') 
                 stack.push(c);
                 else
                    { if(c==')'){
                        if(stack.isEmpty()||stack.pop()!='(')
                            System.out.println(false);
                    }else if(c=='}'){
                        if(stack.isEmpty()||stack.pop()!='{')
                           System.out.print(false);
                    }else{
                        if(stack.empty()||stack.pop()!='[')
                          System.out.println(false);
                    }
                    }
        }
          if(stack.isEmpty())
             System.out.println(true);
             else
              System.out.println(false);
    }
}
