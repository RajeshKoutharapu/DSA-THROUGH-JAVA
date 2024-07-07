public class SingleLL {
    Node head;
    Node tail;
    int size=0;
    public int len(){
        return size;
    }
  // i write this method to get head of the linked list to the class i want to acces the linked list
    public Node gethead(){
        return head;
    }
    public int  deletefirst() {
        int val = head.value;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        return val;
    }
    public int deletelast(){
        if(size<=1){
          return deletefirst();
        }
        Node pre=get(size-2);
        int val=tail.value;
        tail=pre;
        tail.next=null;
       size--;
       return val;

}

  public int deleteAny(int index){
    if(index==0)
      return deletefirst();
      else if(index==size-1)
       return deletelast();
else{
    Node pre=get(index-1);
    int val=pre.next.value;
    pre.next=pre.next.next;
    size--;
    return val;
}
  }

    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
          tail=head;

          size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public void insertionlast(int value){
       
        if(tail==null){
            insertfirst(value);
        }else{
         Node n=new Node(value);
        tail.next=n;
        tail=n;
        size++;
        }
    }
    public void insertionAy(int value ,int index){
        Node temp=head;
        for(int i=0;i<index-1;i++){
           temp=temp.next;
        }
        Node node=new Node(value,temp.next);
       temp.next=node;
       size++;
    }

    public Node find(int value){
        Node temp=head;
        while (temp!=null) {
             if(temp.value==value)
                 return temp;
          else
             temp= temp.next;
        }
 return null;
    }

    public class Node{
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
