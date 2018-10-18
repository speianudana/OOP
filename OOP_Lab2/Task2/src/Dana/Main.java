package Dana;

public class Main {

    public static void main(String[] args) {
        //Creating queue objects
        Queue queue1 = new Queue();
        Queue queue2 = new Queue(4);
        //verifying if queue is empty
        System.out.println("Queue1 is empty: " + queue1.isEmpty());
        //enqueue
        queue1.addElement("Dana");
        queue1.addElement("Daniel");
        queue1.addElement("Test1");
        queue1.addElement("Test2");
        // Checking if queue is full
        System.out.println("Queue1 is full: " + queue1.isFull());
        //accessing peek element(front)
        System.out.println("Queue1 peek element --->" + queue1.getElement());
        //dequeue
        queue1.remove();
        //accessing peek element(front)
        System.out.println("Queue1 peek element --->" + queue1.getElement());
        queue1.addElement("Test3");
        //dequeue
        queue1.remove();
        //accessing peek element(front)
        System.out.println("Queue1 peek element --->" + queue1.getElement());
        System.out.println("Queue1 is full: " + queue1.isFull());
        System.out.println("Queue2 is full: " + queue2.isFull());
    }
}
