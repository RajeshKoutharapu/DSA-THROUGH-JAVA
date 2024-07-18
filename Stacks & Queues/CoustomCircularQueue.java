//import javax.xml.transform.Source;

public class CoustomCircularQueue {
    protected int data[];
    int legth=5;
    int size=0;
    int front=0;
    int end=0;
    public CoustomCircularQueue(){
        this.data=new int [legth];
    }
    public CoustomCircularQueue(int size){
        this.data=new int[size];
    }
 //method to display front
  public int front() throws Exception{
      if(isEmpty())
       throw new Exception("Queue is Empty");
       else{
        return data[front];
       }
  }
    //method to display the Queue
    public void display() throws Exception{
        if(isEmpty()) 
        throw new Exception("Queue is empty");
        else{
            int i=front;
            do{
            System.out.print(data[i++]+"<--");
            //i%=data.length;
            i=i%data.length;
            }while(i!=end);
             System.out.println("ENd");
        }
    }
    //meyhod to  remove data
    public int  remove() throws Exception {
        if(isEmpty())
        throw  new Exception("Queue is empty");
         else{
              int removed =data[front++];
              front%=data.length;
              size--;
              return removed;
         }
    }

    //method to imnsert data 
    public void insert(int value) throws Exception{
        if(isfull())
        throw new Exception("Queue is ful");
        else{
            data[end++]=value;
            end=end%data.length;
            size++;
        }
    }
//method to chesfull or not
  public boolean isfull(){
    if(size==data.length)
       return true;
       else
       return false;
  }

    //method to check empty
    public boolean isEmpty(){
        if(size==0)
          return true;
          else
          return false;
    }
}  
