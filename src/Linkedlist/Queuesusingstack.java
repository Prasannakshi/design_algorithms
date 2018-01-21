package Linkedlist;

import java.util.LinkedList;

/**
 * Created by Prasannakshi on 6/21/2017.
 */
public class Queuesusingstack {
    public static void main(String args[]) {
        myQueue thisone = new myQueue();
        thisone.push(1);
        thisone.push(2);
        thisone.push(3);
        thisone.push(4);
        System.out.print(thisone.pop());
        System.out.print(thisone.pop());
        System.out.print(thisone.peek());
        System.out.print(thisone.empty());
        System.out.print(thisone.pop());
        System.out.print(thisone.pop());
        System.out.print(thisone.empty());
    }

    private static class myQueue {
        LinkedList<Integer> stack1 = new LinkedList<>();
        LinkedList<Integer> stack2 = new LinkedList<>();

        private void push(int x){
            if(stack1.isEmpty()){
                stack1.push(x);
            } else {
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                stack1.push(x);
                while (!stack2.isEmpty()){
                    stack1.push(stack2.pop());
                }
            }
        }

        private boolean empty() {
            return stack1.isEmpty();
        }

        private Integer pop(){
            return stack1.pop();
        }
        private Integer peek(){
            return stack1.peek();
        }
    }
}
