public class ArrayExample3 {
	public static void main(String[] args) {
		// Declaree and initialize an array of doubles
		double[] prices = {13.5, 8.99, 4.0, 24.74, 14.15};
		double sum = 0.0;

		// Calculate the sum of all elements
		for (int i = 0; i < prices.length; i++) {
			sum += prices[i];//sum = sum+prices[i];
		}
		
		//Print the total sum
		System.out.printIn("The total sum of prices is: " + sum)
	}
}
	