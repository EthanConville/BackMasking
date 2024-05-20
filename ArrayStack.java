import java.util.EmptyStackException;


//insert doubleArray prototype here
public class ArrayStack implements BKStack {

    //declare initial size of stack and current number of elements in the stack
    //This will allow us to track how full the stack is and resize the underlying
    //array as needed. Complexity 0(1)
    int INITIAL_CAPACITY = 30;
    double[] initArray = new double [INITIAL_CAPACITY];

    int topOfStack = -1;
    int CURRENT_CAPACITY = INITIAL_CAPACITY;

    //initialize array


    //Implementing methods from interface
    //Implementation of isEmpty. Simply checks if then number of elements
    //from Num elements and if it is 0 returns true else false.
    //Complexity of 0(1)
    @Override
    public boolean isEmpty(){
        return topOfStack == -1;

    }
    //Basically the same as isEmpty but returns an int instead of bool. Complexity 0(1)
    @Override
    public int count(){
        return (topOfStack + 1);
    }

    //adds element to the back of the array. Done instead of front to reduce cost of popping off stack
    // Complexity O(1)
    @Override
    public void push(double d) {
        //add check statement for if array is full
        if(CURRENT_CAPACITY == (topOfStack +1)) {
            doubleArray(initArray);
        }
        //puts value in array starting from the back
        initArray[(CURRENT_CAPACITY - topOfStack)] = d;
        //increment top of stack
        topOfStack++;
    }

    //Ensures the array has enough capacity. Copies the data of the array into a new array twice the size
    //Time taken is 0(n) but only occasionally used so overall addition to complexity will be amortized
    private void doubleArray(double[] initArray) {

        double[] newArray = new double[CURRENT_CAPACITY * 2];
        //puts elements in new array starting halfway through the new array
        //I don't actually remember why I have the array starting from the back, but I remember at some point
        //there was A reason for it
        for(int i = 0; i < CURRENT_CAPACITY; i++){
            newArray[i + CURRENT_CAPACITY] = initArray[i];
        }
        //update current capacity
        CURRENT_CAPACITY = CURRENT_CAPACITY * 2;
        //set old array to point to new array
        initArray = newArray;

    }

    @Override
    //Function pops the top number off the stack and returns it. Takes O(1) time
    public double pop() {
        if(isEmpty()){
            //array exception
            throw new EmptyStackException();
        }
        else {
            //return top of stack value and increment topOfStack counter. We don't actually delete the old values
            // in the array, it's not necessary.
            double temp = initArray[CURRENT_CAPACITY - topOfStack];
            topOfStack--;
            return temp;
        }
    }

    @Override
    //same as pop but doesn't decrement top of stack so value isn't 'removed'
    public double peek() {
        if(isEmpty()){
            //array exception
            throw new EmptyStackException();
        }
        else {
            //return top of stack value
            return initArray[CURRENT_CAPACITY - topOfStack];
        }
    }
}
