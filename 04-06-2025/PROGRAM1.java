class Main {
    public static void main(String[] args) {
        //program to print 1 to 5 numbers using recurstion
        printRange(1,5);
    }
    public static void printRange(int start, int end){
        if(start > end){
            return;
        }
        System.out.println(start);
        printRange(start + 1, end);
    }
}