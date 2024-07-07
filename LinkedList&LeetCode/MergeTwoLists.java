
//letcode Question number  21
public class MergeTwoLists {
    public static void main(String[] args) {
        SingleLL list1=new SingleLL();
        list1.insertionlast(7);
        list1.insertfirst(6);
        list1.insertfirst(5);
        list1.insertfirst(3);
        
       list1.display();
        SingleLL.Node l1head=list1.gethead();
        SingleLL list2=new SingleLL();
        list2.insertfirst(7);
        list2.insertfirst(4);
        list2.insertionlast(8);
        list2.display();
        SingleLL.Node l2head=list2.gethead();
      // use this budiness logic in leet code not the above code
       SingleLL mergedlist=new SingleLL();
       while (l1head!=null && l2head!=null) {
                 if(l1head.value<l2head.value){
                    mergedlist.insertionlast(l1head.value);
                    l1head=l1head.next;
                 }else{
                    mergedlist.insertionlast(l2head.value);
                    l2head=l2head.next;
                 }
         }
       //  mergedlist.display();
         while (l1head!=null) {
             mergedlist.insertionlast(l1head.value);
              l1head=l1head.next;
         }
         while (l2head!=null) {
              mergedlist.insertionlast(l2head.value);
              l2head=l2head.next;
         }
         mergedlist.display();
    }
}
