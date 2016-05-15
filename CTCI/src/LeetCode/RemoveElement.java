package LeetCode;

/**
 * Created by iceman on 5/12/2016.
 */
public class RemoveElement {

    public static void main(String args[]){
        RemoveElement obj = new RemoveElement();
        int[] nums = {3,2,2,3};
        System.out.println(obj.removeElement(nums, 3));
    }
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;

        while(j < nums.length){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        return i;
    }
}
