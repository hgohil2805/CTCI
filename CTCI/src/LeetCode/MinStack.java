package LeetCode;

import java.util.Stack;
import java.util.regex.Matcher;

/**
 * Created by iceman on 8/10/2016.
 */
public class MinStack {

    Stack<Integer> elements;
    Stack<Integer> min ;
    public MinStack() {
        elements = new Stack();
        min = new Stack();
    }

    public void push(int x) {
        elements.push(x);
        if(!min.isEmpty()){
            min.push(Math.min(x,min.peek()));
        }else{
            min.push(x);
        }
    }

    public void pop() {
        elements.pop();
        min.pop();
    }

    public int top() {
        return elements.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
