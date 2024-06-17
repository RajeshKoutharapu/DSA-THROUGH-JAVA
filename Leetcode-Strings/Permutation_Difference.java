//Leet code Question Number 3146



public class Permutation_Difference{
    public static void main(String[] args) {
        String a="abc";
        String b="bac";
        int sum=0;
        //int index=0;
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                  int temp =i-j;
                 
                  int temp1=temp<0?temp*-1:temp;
                  sum=sum+temp1;
                 

                               }
            }
        }
        System.out.println(sum);
    }

}