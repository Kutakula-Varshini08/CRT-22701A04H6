class Main {
    public static void main(String[] args) {
        //program for sum of the digits of the given number is even or odd
        int num=12345;
        int sum=0;
        while(num>0){
            int lastdigit=num%10;  
            sum=sum+lastdigit;
            num=num/10;
        }
       if(sum%2==0){
           System.out.println("sum of the given number is even");
       }
       else{
           System.out.println("sum of the given number is odd");
       }
    }
}