class Main {
    public static void main(String[] args) {
        //program for count of numbers with individual digit sum is even in the given range
        int count=0;
        int range=30;
        for(int i=1;i<=range;i++){
            int num=i;
            int sum=0;
            while(num>0){
                int lastdigit=num%10;  
                sum=sum+lastdigit;
                num=num/10;
        }
        if(sum%2==0){
            count++;
        }
        }
        System.out.println("count of numbers with individual digit sum is even in given range" + count);
    }
}