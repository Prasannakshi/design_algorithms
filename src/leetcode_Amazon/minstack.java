package leetcode_Amazon;

import java.util.Stack;

/**
 * Created by Prasannakshi on 4/28/2017.
 */
public class minstack {
    static class MinStack {
        long min;
        Stack<Long> stack;

        public MinStack(){
            stack=new Stack<>();
        }

        public void push(int x) {
            if (stack.isEmpty()){
                stack.push(0L);
                min=x;
            }else{
                stack.push(x-min);//Could be negative if min value needs to change
                if (x<min) min=x;
            }
        }

        public long pop() {
            if (stack.isEmpty()) return 0;

            long pop=stack.pop();

            if (pop<0)  min=min-pop;//If negative, increase the min value
            return pop;
        }

        public int top() {
            long top=stack.peek();
            if (top>0){
                return (int)(top+min);
            }else{
                return (int)(min);
            }
        }

        public int getMin() {
            return (int)min;
        }
    }
    public static void main(String args[]){
        MinStack myStack = new MinStack();

        myStack.push(5);
        myStack.push(2);
        myStack.push(7);
        myStack.push(9);
        myStack.push(12);
        myStack.pop();
        myStack.top();
        System.out.print(myStack.getMin());

    }
}
