package _4_Stacks;

import java.util.EmptyStackException;
//If we do not know the size of an array or need to resize our collection frequently, we better use LinkedList implementation of Stack

public class ArrayStack {

    private Employee[] stack; //Array to back the stack
    private int top; // index of top position of the stack (initialized to 0 by default)

    //constructor for defining the capacity of the stack
     ArrayStack(int capacity) { //capacity - the maximum number of items we can store in stack
        stack = new Employee[capacity];
    }

    //adding an element to stack. Worst case in O(n)
     void push(Employee employee) { //O(n) because in a worst case we have to copy all existing elements
        if (top == stack.length) { //check if the stack is full
//need to resize the backing array
            Employee[] newArray = new Employee[2 * stack.length]; //double the size of the array if the stack is full
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee; //assign the employee to the top and increment top
    }

    //deleting an element O(1) if not resizing an array and O(n) if resizing
     Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); //throw exception if stack is empty
        }
        //if top is 5, than employee at top of the stack is at position 4
        Employee employee = stack[--top]; //top item on the stack actually stores top-1
        stack[top] = null;
        return employee;
    }

    //get an element from the top of a stack without removing it. Always O(1) because no of resizing
    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];// because top points to the next available item in the stack
    }

    public int size() {
        return top;
    }

    //stack is empty if top is equal to zero
    public boolean isEmpty() {
        return top == 0;
    }

    //print stack from top to bottom
    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}