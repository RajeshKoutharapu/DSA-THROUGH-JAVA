public class DoublyLinkedListOprtaions {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.inserAtFirst(1);
        list.inserAtFirst(2);
        list.inserAtFirst(3);
        list.inserAtFirst(4);
        list.inserAtFirst(5);
        list.inserLast(6);
        list.display();
        list.insesrAny(4,77);
        list.display();
    }
}
 class DLL{
    private Node head;
    private Node tail;
    private int size;


    
    public void insesrAny(int index,int value){
        if(index==0)
            inserAtFirst(value);
            else if(index==size-1)
              inserLast(value);
              else{
                Node node=new Node(value);
                 Node prevnode=getNode(index);
                node.next= prevnode.next;
                node.prev=prevnode;
                prevnode.next=node;
                node.next.prev=node;
              }
              size++;
        }
  
       
    

    public Node getNode(int index){
        Node temp=head;
      for(int i=0;i<index;i++){
        temp=temp.next;
      }
      return temp;
    }
    public void inserLast(int value){
       Node node=new Node(value);
       if(head==null)
           inserAtFirst(value);
        else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
        size++;
    }
 
    public void inserAtFirst(int value){
         Node node=new Node(value);
          if (head == null) {
            head = node;
            tail = head;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
 }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value=value;
            }
    }

}