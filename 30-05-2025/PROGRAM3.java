class Main {
    public static void main(String[] args) {
        //given numer is palindrome or not
        int num=5445;
        int temp=num;
        int rev=0;
        while(temp>0){
            int digit=temp%10;  
            rev=(rev*10)+digit;
            temp=temp/10;
        }
        if(rev==num){
            System.out.println("the given number is palindrome");
        }
        else{
             System.out.println("the given number is not a palindrome");
        }
    }
}