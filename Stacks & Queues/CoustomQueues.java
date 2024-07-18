public class CoustomQueues {
  protected int [] data;
  private static final int dsize=5;
  int end=-1;
  public CoustomQueues(){
    this.data=new int[dsize];
  }
 public CoustomQueues(int size){
    this.data=new int[size];
 }
 //method to display queue
 public void display(){
    for(int i=0;i<=end;i++){
        System.out.print(data[i]+"<--");
    }
    System.out.println();
 }
 //method to find teh peek element
 public int peeek() throws Exception{
    if(isEmpty())
    throw new Exception("Queue is empty");
    else
     return data[0];
 }

 //method to dele te data from the queue
 public int remove() throws Exception{
    if(isEmpty())
     throw new Exception("queue is empty");
     else{
        int removed=data[0];
        for(int i=1;i<=end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
     }
 }
//method to insert data
public void insert(int value) throws Exception{
    if(isFull())
      throw new Exception("Queue is full");
      else{

      
    end++;
    data[end]=value;}
}


//method t find the queue is full or  not
public boolean isFull(){
    if(end==data.length-1)
      return true;
      else
      return false;
}

 //method to find Queue is empty or not
 public boolean isEmpty(){
    if(end==-1)
      return true;
      else
      return false;
 }
}
