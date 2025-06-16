class Main{
	public static void main(String[] args) {
	    //program for finding the sum of the given elements in the Array
		int[] nums = {1,2,3,4,5};
		int sum = 0;
		for(int i=0;i < nums.length;i++) {
			int value = nums[i];
			sum = sum+value;
		}
		System.out.println("sum of the elements in an array " + sum);
	}
}