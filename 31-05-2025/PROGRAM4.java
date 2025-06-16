class Main{
	public static void main(String[] args) {
	    //Program for finding the Minimum number in the given Array
		int[] nums = {22,23,24,21,26,20};
		int min = nums[0];
		for( int i = 1; i<nums.length; i++ ) {
			int value = nums[i];
			if(value < min) {
				min = value;
			}
		}
		System.out.println("Minimun in an given array is " + min);
	}
}