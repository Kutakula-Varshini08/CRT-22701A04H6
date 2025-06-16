class Main {
    public static void main(String[] args) {
        //program to print factorial of a number using recursion
        System.out.println(fact(5));
    }
    public  static int fact(int n){
        if(n == 1){
            return 1;
        }
        int val  = n*fact(n-1);
        return val;
    }
}