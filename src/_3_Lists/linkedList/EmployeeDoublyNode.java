package _3_Lists.linkedList;

import _3_Lists.Employee;

public class EmployeeDoublyNode {

    private Employee employee;
    private EmployeeDoublyNode next;
    private EmployeeDoublyNode previous;  //every node is going to have two references:previous, next

    //constructor takes only employee because when we construct an instance we do not know what the next node will be
    //we to not need to set next to null in the constructor because it is the default value for object fields
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoublyNode getNext() {
        return next;
    }

    //set node location
    public void setNext(EmployeeDoublyNode next) {
        this.next = next;
    }

    public EmployeeDoublyNode(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDoublyNode previous) {
        this.previous = previous;
    }

    public String toString(){
        return employee.toString();
    }
}
