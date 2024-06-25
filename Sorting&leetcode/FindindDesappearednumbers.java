
//leet code Question number 448

import java.util.ArrayList;

import java.util.List;


public class FindindDesappearednumbers {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        int [] nums={1,1};
        boolean [] bool=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            bool[nums[i]-1]=true;
        }
        for(int i=0;i<nums.length;i++){
            if(bool[i]==false)
              list.add(i+1);
        }
        System.out.println(list);
    }
}
