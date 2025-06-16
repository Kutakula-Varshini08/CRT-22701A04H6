class Main {
    public static void main(String[] args) {
        //program to Find the how many ways are there to place a tile of height 2 and breadth 1 in the given breadth is n and of height 2 
        System.out.print(ways(5));
    }
    public static int ways(int n){
        if(n==0 || n==1){
            return 1;
        }
        return ways(n-1)+ways(n-2);
    }
}