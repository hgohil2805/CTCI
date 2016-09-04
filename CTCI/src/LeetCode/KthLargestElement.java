package LeetCode;

import java.util.PriorityQueue;

/**
 * Created by iceman on 9/4/2016.
 */
public class KthLargestElement {

    public static void main(String args[]) {
        KthLargestElement obj = new KthLargestElement();
        int nums[] = {3, 2, 1, 5, 6, 4};
        System.out.println("Kth largest is : " + obj.findKthLargest(nums, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
