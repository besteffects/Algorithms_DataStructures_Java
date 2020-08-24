package _5_Queue;

public class Main {
    public static void main(String[] args) {


        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        System.out.println("Adding elements to queue: ");
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        queue.printQueue();

        queue.remove();
        queue.remove();
        System.out.println("Removed an element from queue: ");
        queue.printQueue();

        System.out.println("Peek: " + queue.peek());
        System.out.println("Queue is not changed after peek(): ");
        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println("Deleted all 3 elements left. Size is:  " + queue.size());

        // System.out.println("Removing an element from empty queu: " +queue.remove());
        queue.add(mikeWilson);
        queue.printQueue();
    }
}
