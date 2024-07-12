//leetcode Qiuestion 12
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height={1,2,3};
        int l=0;
        int h=height.length-1; 
        int max=0;
        while(l<h){
            int water=Math.min(height[l],height[h])*(h-l);
            if(water>max)
               max=water;
            if(height[l]<height[h])
              l++;
              else
              h--;
        }
        System.out.println(max);
    }
}
