package llinearSearch;

public class linearSearch1 {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        int target =4;
        System.out.println(linearSearch(array, target));
    }
    static boolean linearSearch(int [] arr,int target){
           for (int i : arr) {
             if(i == target){
                return true;
             }
           }
        return false;
    }
    
}
