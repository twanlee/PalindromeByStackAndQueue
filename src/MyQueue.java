public class MyQueue<T> {
    private class Node<T> {
        Node<T> next;
        T data;

        public Node(T data) {
            this.data = data;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    public MyQueue(){};
    public void enqueue(T data){
        Node<T> temp = new Node<T>(data);
        if(tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node<T> dequeue(){
        if(head == null){
            tail = null;
            return null;
        }
        Node<T> temp = head;
        head = head.next;
        return temp;
    }
    public void show(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}


