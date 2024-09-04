class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class Stack {
    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.val;
        top = top.next;
        size--;
        return value;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.val;
    }
    public boolean isEmpty() {
        if(top == null)
            return true;
        return false;
    }
    public int size() {
        return size;
    }
    public void displayStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack(); 
        System.out.println("Name: Nagavignesh M\t\t Reg No: 2022503565");
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.displayStack();

        System.out.println("Stack size: " + stack.size());
    }
}