package LeetCode;

/**
 * Created by iceman on 8/15/2016.
 */
public class FirstBadVersion {

    public static void main(String args[]){
        FirstBadVersion obj = new FirstBadVersion();
        System.out.println(obj.firstBadVersion(10));
    }


    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;

        while(start < end){
            int mid = start + (end - start)/2;
            if(!isBadVersion(mid)){
                start = mid + 1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }

    public boolean isBadVersion(int n){
        return n > 4;
    }

}
