package _3_Lists.linkedList;

import _3_Lists.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _3_LinkedList {
    public static void main(String[] args) {

        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
    }
}
