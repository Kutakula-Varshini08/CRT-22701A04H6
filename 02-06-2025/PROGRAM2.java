class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertEnd(10);
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head = null;
    }
    // operation of inserstion at ending
    void insertEnd(int data){
        Node newNode = new Node(data);
        // when head is null
        if(head == null){
            head = newNode;
            return;
        }
        //find the last when head is present
        var temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
       temp.next = newNode;
    }
}