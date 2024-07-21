//leetcode Question 844

import java.util.Stack;

public class BackSpaceString {

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        //StringBuffer  sb=new StringBuffer();
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                 if(!stack.isEmpty())
                        stack.pop();
             } else
                   stack.push(s.charAt(i));
             }
         
         for(int i=0;i<t.length();i++){
             
             if(t.charAt(i)=='#'){
                 if(!stack1.isEmpty())
                        stack1.pop();
             }
               else
               stack1.push(t.charAt(i));
         }
        System.out.println(stack.equals(stack1));

    }
}