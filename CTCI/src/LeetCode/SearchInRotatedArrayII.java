package LeetCode;

/**
 * Created by iceman on 9/7/2016.
 */
public class SearchInRotatedArrayII {
    public static void main(String args[]) {
        SearchInRotatedArrayII obj = new SearchInRotatedArrayII();
        int[] nums = {1, 1, 1, 1, 5, 1, 1};
        System.out.println(obj.search(nums, 5));
    }

    public boolean search(int[] A, int key) {
        int l = 0, r = A.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A[m] == key) return true; //return m in Search in Rotated Array I
            if (A[l] < A[m]) { //left half is sorted
                if (A[l] <= key && key < A[m])
                    r = m - 1;
                else
                    l = m + 1;
            } else if (A[l] > A[m]) { //right half is sorted
                if (A[m] < key && key <= A[r])
                    l = m + 1;
                else
                    r = m - 1;
            } else l++;
        }
        return false;
    }
}
