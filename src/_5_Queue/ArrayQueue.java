package _5_Queue;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    //Add an element to the back of the queue and resize it when array is full
    public void add(Employee employee) {
        if (back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length]; //increse array size twice
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = employee; //assign an employee to the last element in array
        back++;
    }
}
