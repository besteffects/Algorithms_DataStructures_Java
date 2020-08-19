package _3_Lists.linkedList;


import _3_Lists.Employee;

public class EmployeeDoublyLinkedList {
    //we should add nodes to the beginning to avoid extra traversing
    private EmployeeDoublyNode head;
    //initialized to null so we do not need to create a constructor that does it
    private EmployeeDoublyNode tail;
    //initialized to zero by default when a list is created
    private int size;

    //we do not need a previous field because it will be initialized to null
    public void addToFront(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++; //incrementing the size
    }
//adds an employee to the end
    public void addToEnd(Employee employee) {
        //creating a new node
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        if (tail == null) { //test if a list is empty
        } else {
            tail.setNext(node); //set current tail next field to the node we are adding
            node.setPrevious(tail); //set the previous node to what used to be the tail
        }
        tail=node;
        size++;


    }

    public EmployeeDoublyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removeNode = head; // the item we will remove
        head = head.getNext(); //point to the last element in list
        size--; //decrement the size because we now have one less item
        removeNode.setNext(null); //cleaning up the references. This step is not obligatory
        return removeNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeDoublyNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext(); //move to the next node
        }
        System.out.print("null");
    }
}
