package _3_Lists.linkedList;

import _3_Lists.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _3_LinkedList {
    public static void main(String[] args) {


        Employee janeJones =new Employee("Jane", "Jones", 123);
        Employee johnDoe= new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println("Is empty when no items added? "+ list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        //print the size of the linked list
        System.out.println("List size after items were added:"  + list.getSize());
        System.out.println("Full list: ");
        list.printList();
        System.out.println("Removing front item... ");
        list.removeFromFront();
        System.out.println("Number of items after removal: " + list.getSize());
        list.printList();
    }
}
