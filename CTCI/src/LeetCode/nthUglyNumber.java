package LeetCode;

import java.util.PriorityQueue;

/**
 * Created by iceman on 9/9/2016.
 */
public class nthUglyNumber {
    public static void main(String args[]){
        nthUglyNumber obj = new nthUglyNumber();
        System.out.println("Nth ugly number is :"+obj.nthUglyNumber(10));
    }


    public int nthUglyNumber(int n) {
        if(n == 1) return 1;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.add(1l);

        for(int i = 1 ; i < n ; i++){
            long tmp = pq.poll();
            while(!pq.isEmpty() && pq.peek() == tmp)
                tmp = pq.poll();
            pq.add(tmp *  2);
            pq.add(tmp * 3);
            pq.add(tmp * 5);
        }
        return pq.poll().intValue();
    }
}
