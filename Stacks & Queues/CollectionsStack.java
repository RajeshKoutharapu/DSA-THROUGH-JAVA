import java.util.Stack;

public class CollectionsStack {
       public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(14);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.add(16));
        System.out.println(stack);
        System.out.println(stack.capacity());
        System.out.println(stack.contains(4));
        System.out.println(stack.indexOf(4));
        //System.out.println(stack.);

        
       }
}
