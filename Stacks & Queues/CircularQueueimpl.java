public class CircularQueueimpl {
    public static void main(String[] args) throws Exception {
        CoustomCircularQueue queue=new CoustomCircularQueue(6);
        System.out.println(queue.data.length);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.display();
        queue.remove();
        queue.display();
        System.out.println(queue.front());
         
    }
}
