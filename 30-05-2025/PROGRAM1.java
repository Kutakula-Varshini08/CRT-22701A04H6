class Main {
    public static void main(String[] args) {
        //reverse of the number 4321
        int num=4321;
        int temp=num;
        int rev=0;
        while(temp>0){
            int digit=temp%10;  
            rev=(rev*10)+digit;
            temp=temp/10;
        }
        System.out.println("reverse of " + num +" = "+rev);
    }
}

