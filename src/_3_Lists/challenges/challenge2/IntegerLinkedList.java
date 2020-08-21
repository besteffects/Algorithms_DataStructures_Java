package _3_Lists.challenges.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
        // Assumption the list is sorted

        // 1 Check if a list is empty or first node in the list is greater or equal to the value we are inserting
        if (head == null || head.getValue() >= value) {
            addToFront(value);
            return;
        }
        //2 Find the insertion point
        //We will need two fields: one for traversing the list and another that will be one position behind the current field
        IntegerNode current = head.getNext(); //current node starts at head.next(), first value we check
        IntegerNode previous = head; //previous node is always one position behind the current node
        while (current != null && current.getValue() < value) {
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current); //inserting a new node before a current node

        //3 we have to handle previous's node next field
        previous.setNext(newNode);
        size++;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
