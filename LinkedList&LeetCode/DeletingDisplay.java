public class DeletingDisplay {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertfirst(20);
        list.insertfirst(30);
        list.insertfirst(40);
        list.insertfirst(50);
        list.insertfirst(60);
        list.display();
       list.deletefirst();
        
         list.deletelast();
         list.display();

        
    }
}
class LL {
    private Node head;
    private Node tail;
    private int size=0;

    public int  deletefirst() {
        int val = head.value;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        return val;
    }



      public int deletelast(){
        Node prev=get(size-2);
        tail=prev;
        prev.next=null;
         
        return prev.next.value;
      }

      public Node get(int index){
        Node temp=head;
        for(int i=0;i<=index;i++){
            temp=temp.next;
        }
        return temp;
      }

    public void insertfirst(int value){
        //Node node=new Node(value);
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
          tail=head;
         size++;
    }
   
    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value+"-->");
            temp=temp.next;
         
        }
        System.out.println("End");
    }

    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
