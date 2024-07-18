class StackException extends Exception{
    public StackException(String msg){
        super(msg);
    }
}

public class CoustemStack {
   
   protected int [] data;
    int size;
    int ptr=-1;
    public CoustemStack(){
      this.data=new int[10];
    }
    public CoustemStack(int size){
        this.data=new int [size];
    }
    //method to display stack
    public void display() throws StackException{
        if(isEmpty()){
            throw new StackException("stack is empty uable to display");
        }else
           {
            for(int i=ptr;i>=0;i--){
                  System.out.println(data[i]);
            }
           }
    }

// method to get peek element from the stack
public int peek() throws StackException{
    if(isEmpty())
     throw new StackException("stack is empty unable to get peek ");
     else
     return data[ptr];
}
    //method to pop element from the stack
    public int  pop() throws StackException{
        if(isEmpty())
          throw new StackException("stack is empty unable to pop");
        else{
          int removed=data[ptr];
          ptr--;
          return removed;
        }

    }
//method to push the element into the stack
  public void push(int val) throws StackException{
    if(isFull())
       throw new StackException("Stack is full unable to push");
       else
       ptr++;
       data[ptr]=val;
  }

//method to chexk stack is full pr not
    public boolean isFull(){
        if(ptr==data.length-1)
          return true;
          else
         return  false;
    }
//method to check satck is empty or not
  public boolean isEmpty(){
    if(ptr==-1)
    return true;
    else
    return false;
  }
}
