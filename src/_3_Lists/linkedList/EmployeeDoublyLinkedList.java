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
            node.setNext(head);
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
        tail = node;
        size++;


    }

    public EmployeeDoublyNode removeFromFront() {
        //if there is only 1 node in the list, we should update the tail, because the tail will become null
        //if >1 node we do not have to change the tail
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removedNode = head;

//test to see if we are removing the only node in the list
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeDoublyNode removeFromEnd() {
        //we need to change the tail and set previous node's next field to null
        //if there is the only one element in the list, we need to set head to null
        if (isEmpty()) {
            return null;
        }

        EmployeeDoublyNode removeNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);
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
