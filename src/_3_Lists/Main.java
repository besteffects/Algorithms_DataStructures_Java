package _3_Lists;

import java.util.ArrayList;
import java.util.List;

public class Main<T> {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        //replace an item
        employeeList.set(1, new Employee("John", "Adams", 4568));
        System.out.println("Number of elements in list: " + employeeList.size()); //tells how many elements are in array
        //All other elements will be shifted towards the end of list
        employeeList.add(3, new Employee("John", "Doe", 4567));

        //Convert to array
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        System.out.println("Print of employees list in after list is converted to array: ");
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        //contains() returns false if we do not implement equals() method
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        //Finds the index of Employee with the same values in the fields
        System.out.println(employeeList.indexOf(new Employee("John", "Doe",4567)));

    //removing can be expensive because indexes that come after have to be shifted down
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }


}
