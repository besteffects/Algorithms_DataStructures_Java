package _4_Stacks;

//We do not need random access for a stack, because we work only with a top element of a stack
public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));
        stack.printStack();

        System.out.println("Peek: " + stack.peek()); //printing the element that was added last
        //stack.printStack();

        System.out.println("Popped: " + stack.pop());    //remove element from the top of stack
        System.out.println("Peek: " + stack.peek());

    }
}
