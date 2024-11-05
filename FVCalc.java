// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		int futureValue = (int) (currentValue * (Math.pow((1 + (interestRate / 100.0)), years)));

		System.out.println("After " + years + " years, $" + currentValue + " saved at " + interestRate + "% will yield $" + futureValue);
	}
}