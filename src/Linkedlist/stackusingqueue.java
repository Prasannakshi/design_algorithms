package Linkedlist;

import java.util.LinkedList;

/**
 * Created by Prasannakshi on 6/21/2017.
 */
public class stackusingqueue {
    public static void main(String args[]){
        myStack newone = new myStack();
        newone.push(1);
        newone.push(2);
        newone.push(3);
        newone.push(4);
    }

    private static class myStack {
        LinkedList<Integer> queue1 = new LinkedList<Integer>();
        LinkedList<Integer> queue2 = new LinkedList<Integer>();

        // Push element x onto stack.
        public void push(int x) {
            if(empty()){
                queue1.offer(x);
            }else{
                if(queue1.size()>0){
                    queue2.offer(x);
                    int size = queue1.size();
                    while(size>0){
                        int s = queue1.poll();
                        queue2.offer(s);
                        size--;
                    }
                }else if(queue2.size()>0){
                    queue1.offer(x);
                    int size = queue2.size();
                    while(size>0){
                        queue1.offer(queue2.poll());
                        size--;
                    }
                }
            }
        }

        // Removes the element on top of the stack.
        public void pop() {
            if(queue1.size()>0){
                queue1.poll();
            }else if(queue2.size()>0){
                queue2.poll();
            }
        }

        // Get the top element.
        public int top() {
            if(queue1.size()>0){
                return queue1.peek();
            }else if(queue2.size()>0){
                return queue2.peek();
            }
            return 0;
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return queue1.isEmpty() & queue2.isEmpty();
        }
    }
}
