//leetcode Question number 2108
public class FirstPalidrom {
    public static void main(String[] args) {
        String [] words={"abc","car","ada","racecar","cool"};
        for (String e : words) {
            String rev = new StringBuilder(e).reverse().toString();

            if (e.equals(rev)) {
              System.out.println(e);
              break;
            }
        }
        System.out.println("");
    }
}
