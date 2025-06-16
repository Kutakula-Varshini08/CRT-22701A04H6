class Main {
    public static void main(String[] args) {
        //program for sum of the digits of given number
        int num=5445;
        int sum=0;
        while(num>0){
            int lastdigit=num%10;  
            sum=sum+lastdigit;
            num=num/10;
        }
       System.out.println("sum of the digits of a given number is " + sum);
    }
}