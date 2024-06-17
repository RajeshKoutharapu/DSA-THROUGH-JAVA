
// leet code Question number 2710
public class RemovingTrailingZeroes {
    public static void main(String[] args) {
          String num = "51230100";
         
                int count = 0;
                int n = num.length();
                for(int i = n-1;i>=0;i--){
                    char c = num.charAt(i);
                    if(c=='0'){
                        count++;
                    }
                    else{
                        break;
                    }
                }
               System.out.println(num.substring(0,n-count));
            }
          }
         
    

