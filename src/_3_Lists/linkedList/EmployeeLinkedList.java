package _3_Lists.linkedList;

import _3_Lists.Employee;

public class EmployeeLinkedList {
    //we should add nodes to the beginning to avoid extra traversing
    private EmployeeNode head;
    //initialized to zero by default when a list is created
    private int size;

    //We are inserting the node to the front of the list
    //we are inserting a node that is set as head, and previous head becomes next node
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++; //incrementing the size
    }

    public  EmployeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }
        EmployeeNode removeNode = head; // the item we will remove
        head=head.getNext(); //point to the last element in list
        size--; //decrement the size because we now have one less item
        removeNode.setNext(null); //cleaning up the references. This step is not obligatory
        return removeNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext(); //move to the next node
        }
        System.out.print("null");
    }
}
