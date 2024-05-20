/**
 * Interface for a stack of primitive doubles.
 *
 *          NOTE: You will need to provide much better descriptive
 *          comments than the ones provided in this interface
 */
public interface BKStack {

    /**
     * is empty?
     */
    public boolean isEmpty();

    /**
     * count
     *
     * @return the number of elements stored in the stack
     */
    public int count();

    /**
     * push
     */
    public void push(double d);

    /**
     * pop
     *
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     *
     */
    public double pop();

    /**
     * peek
     *
     * @throws EmptyStackException f stack is empty
     *             i
     */
    public double peek();
}
