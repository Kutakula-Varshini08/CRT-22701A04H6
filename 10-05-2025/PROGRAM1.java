class Main {
    public static void main(String[] args) {
        //Program for prime number
        int num = 9;
        int fact = 0;
        for(int i=2; i<=num;i++){
            if(num%i==0){
                fact++;
            }
        }
        if(fact==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}