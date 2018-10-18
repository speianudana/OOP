package Dana;

/**
 * Queue using First-In-First-Out principle
 */
public class Queue {

    private static final int DEFAULT_MAX_SIZE = 4;
    private String[] queue;
    private int front;
    //numberOf elements - Class state according to task 2
    private int rear;

    /**
     * Empty constructor with default array size stored in DEFAULT_MAX_SIZE
     */
    public Queue() {
        this.queue = new String[DEFAULT_MAX_SIZE];
    }

    /**
     * Constructor with array size
     * @param capacity represents the maximum query capacity
     */
    public Queue(int capacity) {
        this.queue = new String[capacity];
    }

    /**
     * Enqueue element to stack
     * @param data element to be added to queue
     * @return true is element was added and false if queue is full
     */
    public boolean addElement(String data) {
        if (!isFull()) {
            queue[rear] = data;
            rear++;
            return true;
        }
        return false;
    }

    /**
     * Dequeue element to stack
     * @return Element that was removed from queue
     */
    public String remove() {
        if (rear == 0) {
            return null;
        }

        String data = queue[front];
        queue[front] = null;
        front = front + 1;
        rear--;
        return data;
    }

    /**
     * Accessing the first element according to FIFO principle
     * also named peek
     * @return front element of queue
     */
    public String getElement() {
        return queue[front];
    }

    /**
     * Verifying if queue is empty
     * @return true if queue is empty and false if full
     */
    public boolean isEmpty() {
        return front == 0 || front > rear;
    }

    /**
     * Verifying if queue is full
     * @return true if queue is full false if empty
     */
    public boolean isFull() {
        //queue.length is MAXSIZE
        return rear == queue.length - 1;
    }
}