package _3_Lists.linkedList;

import _3_Lists.Employee;

public class EmployeeLinkedList {
    //we should add nodes to the beginning to avoid extra traversing
    private EmployeeNode head;

    //We are inserting the node to the front of the list
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head=node;
    }
}
