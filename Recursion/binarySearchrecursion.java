public class binarySearchrecursion {
    public static void main(String[] args) {
            int [] arr={1,2,4,5,6,7,8,9};
            int key=9;
       System.out.println( Bs(arr,0,arr.length-1,key));
          
    }

    static int Bs(int [] arr,int l,int h,int key){
     
        if(l>h)
          return -1;
       int   mid=(l+h)/2;
        if(arr[mid]==key)
          return mid;
          else if(arr[mid]>key)
           return Bs(arr,l,mid-1,key);
           else
              return Bs(arr,mid+1,h,key);      
  
    }
}
