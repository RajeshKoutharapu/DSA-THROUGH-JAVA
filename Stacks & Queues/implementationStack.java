public class implementationStack {
    public static void main(String[] args) throws StackException {
        CoustemStack satck=new CoustemStack(5);
        satck.push(33);
        satck.push(3);
        satck.push(23);
        satck.push(13);
        satck.push(5);
        satck.display();
        System.out.println();
        //satck.pop();
        satck.display();
        System.out.println();
        System.out.println(satck.peek());
           satck.push(44);
           satck.display();

    }
}
