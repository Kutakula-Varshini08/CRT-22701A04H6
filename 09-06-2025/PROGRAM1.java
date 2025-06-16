class Main {
    public static void main(String[] args) {
        //program for linear search
        int[] num = {10,19,2,3,1,8,9};
        int target = 9;
        int index = -1;
        for(int i = 0;i<num.length;i++){
            if(target == num[i])
            index = i;
        }
        System.out.println(index == -1?"Element not found" : "Element found at index " + index);
    }
}