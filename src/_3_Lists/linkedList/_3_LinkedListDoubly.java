package _3_Lists.linkedList;

import _3_Lists.Employee;

public class _3_LinkedListDoubly {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println("Doubly list size: " + list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(" List size after Bill was added to the end: " + list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(" List size after last item was removed from the front: " + list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(" List size after last item was removed from the end: " + list.getSize());
    }
}
