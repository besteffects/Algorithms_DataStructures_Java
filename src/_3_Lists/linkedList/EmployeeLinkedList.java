package _3_Lists.linkedList;

import _3_Lists.Employee;

public class EmployeeLinkedList {
    //we should add nodes to the beginning to avoid extra traversing
    private EmployeeNode head;

    //We are inserting the node to the front of the list
    //we are inserting a node that is set as head, and previous head becomes next node
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head=node;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current!=null){
            System.out.print(current);
            System.out.print(" -> ");
            current=current.getNext(); //move to the next node
        }
        System.out.print("null");
    }
}
