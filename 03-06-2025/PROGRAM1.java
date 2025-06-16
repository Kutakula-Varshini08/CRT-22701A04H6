 class Main {
    public static void main(String[] args) {
        //program of stack using stack operations by an array
        Stack stack = new Stack(5);
        stack.push(20);
        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.push(50);
        stack.push(20);
        stack.pop();
        stack.print();
        System.out.println("The Peak value is:" + stack.peak());
    }
}
class Stack{
    int[] stack;
    int size;
    int top;
    //creating a stack function
    Stack(int size){
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }
    //stack operation isFull()
    boolean isFull(){
        if(top == size - 1){
            System.out.println("Stack is Full");
            return true;
        }
        else{
            return false;
        }
    }
    //stack operation isEmpty()
    boolean isEmpty(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return true;
        }
        else{
            return false;
        }
    }
    //stack operation push()
    void push(int val){
        if(isFull()){
            return;
        }
        top = top + 1;
        stack[top] = val;
    }
    //stack operation pop()
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val = stack[top];
        top = top - 1;
        return val;
    }
    //stack operation peak
    int peak(){
        if(isEmpty()){
            return -1;
        }
        return stack[top];
    }
    void print(){
        for(int i = top; i>=0; i--){
            System.out.println("|" + stack[i] + "|");
        }
        System.out.println("-------------------");
    }
}