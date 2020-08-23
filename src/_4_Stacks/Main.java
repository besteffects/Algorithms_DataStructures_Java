package _4_Stacks;

//We do not need random access for a stack, because we work only with a top element of a stack
public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        System.out.println("ArrayList stack implementation: ");
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);
        stack.printStack();

        System.out.println("Peek: " + stack.peek()); //printing the element that was added last
        //stack.printStack();

        System.out.println("Popped: " + stack.pop());    //remove element from the top of stack
        System.out.println("Peek: " + stack.peek());

        System.out.println("Linked list stack: ");
        LinkedStack lstack = new LinkedStack();
        lstack.push(janeJones);
        lstack.push(johnDoe);
        lstack.push(marySmith);
        lstack.push(mikeWilson);
        lstack.push(billEnd);
        lstack.printLStack();
    }
}
