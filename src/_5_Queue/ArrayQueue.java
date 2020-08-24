package _5_Queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    //Add an element to the back of the queue and resize it when array is full
    void add(Employee employee) {
        if (back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length]; //increse array size twice
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = employee; //assign an employee to the last element in array
        back++;
    }

    Employee remove() {
        if (size() == 0) { //1 Check if a queue is empty
            throw new NoSuchElementException();
        }
        Employee employee = queue[front]; //save the employee at the front of the queue
        queue[front] = null;
        front++; //front index moves one position ahead

        if (size() == 0) { //for the case when only one employee is being removed
            front = 0;
            back = 0;
        }
        return employee; //Return employee at the front of the queue
    }

    Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front]; //get the front element
    }

    public int size() {
        return back - front;
    }

    void printQueue() {
        for (int i = front; i < back; i++) { //back refers to the next available position so the length of the queue is back-1
            System.out.println(queue[i]);
        }
    }
}
