// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int unities = Integer.parseInt(args[0]) % 10;
		int dozens = (Integer.parseInt(args[0]) / 10) % 10;
		int hundreds = Integer.parseInt(args[0]) / 100;

		System.out.println(hundreds + " hundreds, " + dozens + " tens, and " + unities + " ones.");

	}
}
