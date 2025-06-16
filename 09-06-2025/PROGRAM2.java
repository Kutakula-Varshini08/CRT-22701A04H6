class Main {
    public static void main(String[] args) {
        //program for linear search by using function
        System.out.println(linearSearch(new int[] {10,19,2,3,1,8,9},19));
        System.out.println(linearSearch(new int[] {10,19,2,3,1,8,9},9));
        System.out.println(linearSearch(new int[] {10,19,2,3,1,8,9},7));
    }
    public static int linearSearch(int[] num,int target){
        for(int i =0;i<num.length;i++){
            if(target == num[i]) return i;
        }
        return -1;
    }
}