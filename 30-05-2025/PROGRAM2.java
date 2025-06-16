class Main {
    public static void main(String[] args) {
        //given numer is good number or bad number
        int num=432100;
        int temp=num;
        int rev=0;
        while(temp>0){
            int digit=temp%10;  
            rev=(rev*10)+digit;
            temp=temp/10;
        }
        int rev1=0;
        while(rev>0){
            int digit=rev%10;  
            rev1=(rev1*10)+digit;
            rev=rev/10;
        }
        if(rev1==num)
        {
            System.out.println(num + " is equal to " +  rev1 + " = " + "good number");
        }
        else{
             System.out.println(num + " is not equal to " +  rev1 + " = " + "bad number");
        }
    }
} 