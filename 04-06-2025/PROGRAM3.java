import java.util.Stack;
class Main {
    public static void main(String[] args) {
        //program of pushing a element in the given stack using recursion
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        pushBottom(s,40);
        System.out.println("Elements in the Stack are:");
        System.out.println(s);
    }
    public static void pushBottom(Stack<Integer> stack, int ele){
        if(stack.isEmpty()){
            stack.push(ele);
            return;
        }
        int val = stack.pop();
        pushBottom(stack,ele);
        stack.push(val);
    }
}
