class Main{
	public static void main(String[] args) {
	    //program for finding the power of a number using recursion
		System.out.println(npowx(3,4));
	}
	public static int npowx(int n, int x) {
		if(x <= 0) {
			return 1;
		}
		int value = n*npowx(n,x-1);
		return value;
	}
}