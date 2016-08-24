package Code;

import java.util.PriorityQueue;

/**
 * Created by iceman on 8/23/2016.
 */
public class KthSmallestElement {

    public static void main(String args[]) {
        KthSmallestElement obj = new KthSmallestElement();

    }

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
        for (int i = 0; i < n; i++) {
            pq.offer(new Tuple(0, i, matrix[0][i]));
        }
        for (int i = 0; i < k - 1; i++) {
            Tuple temp = pq.poll();
            if (temp.x == n - 1) {
                continue;
            }
            pq.offer(new Tuple(temp.x + 1, temp.y, matrix[temp.x + 1][temp.y]));
        }
        return pq.poll().value;
    }
}

class Tuple implements Comparable<Tuple> {
    int x, y, value;

    public Tuple(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }


    @Override
    public int compareTo(Tuple that) {
        return this.value - that.value;
    }
}
