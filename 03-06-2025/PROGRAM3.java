public class Main{
    public static void main(String[] args){
        //program of Queue using Queue operations by an array
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        int val = q.dequeue();
        System.out.println("removed value:" + val);
        q.print();
    }
}
//creating a Queue function
class Queue{
    int[] queue;
    int rear;
    int size;
    int front;
    Queue(int size){
        this.size = size;
        this.queue = new int[size];
        this.rear = -1;
        this.front = 0;
    }
    //Queue operation isFull()
    boolean isFull(){
        if(rear == size -1){
            return true;
        }else{
            return false;
        }
    }
    //Queue operation isEmpty()
    boolean isEmpty(){
        if(rear == -1){
            return true;
        }else{
            return false;
        }
    }
    //Queue operation enqueue()
    void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full" + val);
            return;
        }
        rear = rear + 1;
        queue[rear] = val;
    }
    //Queue operation dequeue()
    int dequeue(int val){
        if(isEmpty()){
            System.out.println("Queue is empty" + val);
            return -1;
        }
        int removedVal = queue[front];
        front++;
        return removedVal;
    }
    void print(){
        System.out.println("----------------------");
        for(int i = 0; i<=rear; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("\n----------------------");
    }
}

