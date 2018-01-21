package Linkedlist;

import java.util.Arrays;

/**
 * Created by Prasannakshi on 6/21/2017.
 */
public class Queueusingarray {
    public static void main(String args[]){
        myqueue q = new myqueue(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.pop();
        q.push(6);
        System.out.println(q);
    }

    private static class myqueue {
        int[] arr = null;
        int CAP;
        int front = -1,back = -1;
        int size = 0;

        private myqueue(int cap) {
            this.CAP = cap;
            this.arr = new int[cap];
        }

        private boolean push(int x){
            if (!isFull())
                return false;
            if(this.size==0){++front;}
            this.size++;
            this.arr[++back] = x;
            return true;
        }

        private int pop(){
            if (this.size == 0) {
                return Integer.parseInt(null);
            }
            this.size--;
            int ans = this.arr[front];
            this.arr[front] = Integer.parseInt(null);
            front++;
            return ans;
        }

        public boolean isFull() {
            if (this.size == this.CAP)
                return false;
            return true;
        }

        private int peek(){
            if(size==0)
                return Integer.parseInt(null);

            return arr[front];
        }

        private String tosString() {
            return Arrays.toString(this.arr);
        }
    }
}
