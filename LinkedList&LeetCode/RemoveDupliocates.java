
//leetcode Questionnumber 83;
public class RemoveDupliocates {
    public static void main(String[] args) {
        SingleLL list=new SingleLL();
        list.insertfirst(1);
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(3);
        SingleLL.Node head=list.gethead();
          if(head.next==null){
            list.display();
          }else{
        while(head.next!=null){
            if(head.value==head.next.value){
                head.next=head.next.next;
            }else{
                head=head.next;
            }

        }
    }
    list.display();

    }
}
