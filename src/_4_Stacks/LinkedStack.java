package _4_Stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Employee> lStack;

    public LinkedStack() {
        lStack = new LinkedList<Employee>();
    }
//add an item to the head of the list
    void push(Employee employee) {
        lStack.push(employee);
    }
//remove an item from the head of the list
    Employee pop() {
        return lStack.pop();
    }
//return the head of the list
    Employee peek(){
        return lStack.peek();
    }

    public boolean isEmpty(){
        return lStack.isEmpty();
    }

    //Print list from head to tail
    void printLStack() {
        ListIterator<Employee> listIterator = lStack.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

}
