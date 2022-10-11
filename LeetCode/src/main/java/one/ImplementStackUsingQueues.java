package one;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ImplementStackUsingQueues {

        Queue<Integer> stack = new LinkedBlockingQueue<>();
        int lastAdd = 0;

        public ImplementStackUsingQueues() {

        }

        public void push(int x) {
            lastAdd = x;
            stack.add(x);
        }

        public int pop() {
            int lastDigit = 0;
            int size = stack.size();
            for(int i = 0; i < size; i++){
                if (i == size - 1){
                    return stack.poll();
                }
                stack.add(stack.poll());
            }

            return lastDigit;
        }

        public int top() {
            return lastAdd;
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */


// 1 2 3

// 1 2
