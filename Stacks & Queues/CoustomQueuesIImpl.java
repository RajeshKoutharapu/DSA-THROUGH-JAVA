public class CoustomQueuesIImpl {
    public static void main(String[] args) throws Exception {
        CoustomQueues queue=new CoustomQueues(6);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
        queue.display();
        System.out.println(queue.peeek());
        queue.remove();
        queue.display();
    
        
    }
}
