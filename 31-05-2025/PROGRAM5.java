class Main{
	public static void main(String[] args) {
	    //Program for finding the Maximum number in the given array
		int[] nums = {70,43,87,9,88,7};
		int max = nums[0];
		for(int i = 0;i<nums.length;i++) {
			int value = nums[i];
			if(value > max) {
				max = value;
			}
		}
		System.out.println("Maximun value in the given array " + max);
	}
}