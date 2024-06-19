public class linearSearchrecursion {
    public static void main(String[] args) {
        int [] num={2,4,66,7,3,8,1};
        int target=66;
    finding obj=new finding();
    int res=obj.linearsearch(num, target, 0);
    System.out.println("elemnet found At index :"+res);
    }

}
class finding{
    public int linearsearch(int [] num,int target, int index){

        if(index==num.length-1)
          return -1;
         if(num[index]==target)
         return index;

         return linearsearch(num, target, index+1);
    

    }
}
