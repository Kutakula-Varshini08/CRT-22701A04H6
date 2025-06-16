import java.util.Stack;
class Main {
    public static void main(String[] args) {
        //program to reverse the given stack
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Reversed stack is:");
        rev(s);
    }
    public static void rev(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int val = stack.pop();
        System.out.print(val + " ");
        rev(stack);
        stack.push(val);
    }
}
