class Main {
    public static void main(String[] args) {
        //program for count of numbers with individual digit sum is even for the given valve of n
        int count=0;
        int n=12;
        for(int i=1;i<=n;i++){
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
        System.out.println("count of numbers with individual digit sum is even for the given valve of n " + count);
    }
}