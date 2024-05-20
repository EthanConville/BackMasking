import java.util.EmptyStackException;
import java.util.Iterator;

public class ListStack implements BKStack {

    private ListStackNode head;
    //constructor
    public ListStack() {
        ListStackNode head = null;
    }
       //If the head pointer doesn't point to anything, the stack is empty. o(1) time
        @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    //enhanced for loop for total number of items in the stack. Makes time to count O(n) instead
    //of O(n^2). Still a little shaky on how these work so I hope my implementation is correct.
    public int count() {
        int count = 0;
        for (ListStackNode current = head; current != null; current = current.next){
            count++;
    }
        return count;
        }

        //new node created. next node now points to the previous head node and the new node becomes
        //the head, inserting it at the beginning of the list. O(1) time
    @Override
    public void push(double d) {
        ListStackNode newNode = new ListStackNode(d);
        newNode.next = head;
        head = newNode;
    }

    //First check to see if stack is empty and throw an exception if it is. Then take the
    //first item in the linked list store it in a temp variable then set the head to be the
    //next variable in the stack, removing the item. O(1) time
    @Override
    public double pop() {
        if (isEmpty()){
            //array exception
            throw new EmptyStackException();
        }
        double temp = head.data;
        head = head.next;
        return temp;
    }

    //same as pop but doesn't remove from list. O(1) time
    @Override
    public double peek() {
        if (isEmpty()){
            //array exception
            throw new EmptyStackException();
        }
        return head.data;
    }
}
