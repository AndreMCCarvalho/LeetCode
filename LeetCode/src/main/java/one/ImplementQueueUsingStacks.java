package main.java.one;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    int peek = 0;

    public static void main(String[] args) {

    }

    public void push(int x) {
        if(stack.isEmpty()) peek = x;
        stack.push(x);
    }

    public int pop() {
        peek();
        return temp.pop();
    }

    public int peek() {
        if(temp.isEmpty()){
            while(!stack.isEmpty()){
                temp.push(stack.pop());
            }
        }
        return temp.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && temp.isEmpty();
    }

}
