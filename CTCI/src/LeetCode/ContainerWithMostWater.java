package LeetCode;

/**
 * Created by iceman on 9/4/2016.
 */
public class ContainerWithMostWater {
    public static  void main(String args[]){
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] nums = {5,2,12,1,5,3,4,11,9,4};
        int res = obj.maxArea(nums);
        System.out.println("Max Area :"+res);
    }

    public int maxArea(int[] height) {
        int L = height.length;
        int lo = 0;
        int hi = L - 1;
        int max = 0;
        if(L < 2) return 0;
        while(lo < hi){
            int loMax = height[lo];
            int hiMax = height[hi];

            int candididate = (hi - lo) * (loMax < hiMax ? loMax : hiMax);
            max = candididate > max ? candididate: max;

            if(height[lo] <= height[hi])
                while(lo < L - 1 && height[lo] <= loMax)
                    ++lo;
            else
                while(hi > 0 && height[hi] <= hiMax)
                    --hi;

        }
        return max;
    }
}
