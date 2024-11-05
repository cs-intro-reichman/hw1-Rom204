// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);

		int a = (int) (Math.random() * limit);
		int b = (int) (Math.random() * limit);
		int c = (int) (Math.random() * limit);

		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int mid = a + b + c - min - max;

		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.println(c);
		System.out.print(min + " ");
		System.out.print(mid + " ");
		System.out.println(max);
	}
}
