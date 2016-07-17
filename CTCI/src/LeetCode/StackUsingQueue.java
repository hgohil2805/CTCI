package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by iceman on 7/17/2016.
 */
public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public static void main(String args[]){

    }


    // Push element x onto stack.
    public void push(int x) {
        q1.add(x);

        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }

        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }

    }

    // Removes the element on top of the stack.
    public void pop() {
        q2.poll();
    }

    // Get the top element.
    public int top() {
        return q2.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
