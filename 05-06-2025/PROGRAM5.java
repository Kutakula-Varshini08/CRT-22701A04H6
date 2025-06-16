class Main {
	public static void main(String[] args) {
		int[] a = {1,19,22,39,49};
		int[] b = {3,15,29,32,47,89};
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			}else {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		while(i < a.length) {
			c[k] = a[i];
			k++;
			i++;
		}
		while(j < b.length) {
			c[k] = b[j];
			k++;
			j++;
		}
		System.out.print("Elements in c are:");
		for(k = 0; k<c.length; k++) {
			System.out.print(c[k] + " ");
		}
	}
}