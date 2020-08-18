package _3_Lists.linkedList;

import _3_Lists.Employee;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    //constructor takes only employee because when we construct an instance we do not know what the next node will be
    //we to not need to set next to null in the constructor because it is the default value for object fields
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    //set node location
    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }
}
