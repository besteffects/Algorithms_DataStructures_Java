package _3_Lists.linkedList;

import _3_Lists.Employee;

public class EmployeeSinglyNode {

    private Employee employee;
    private EmployeeSinglyNode next;

    //constructor takes only employee because when we construct an instance we do not know what the next node will be
    //we to not need to set next to null in the constructor because it is the default value for object fields
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeSinglyNode getNext() {
        return next;
    }

    //set node location
    public void setNext(EmployeeSinglyNode next) {
        this.next = next;
    }

    public EmployeeSinglyNode(Employee employee) {
        this.employee = employee;
    }

    public String toString(){
        return employee.toString();
    }
}
