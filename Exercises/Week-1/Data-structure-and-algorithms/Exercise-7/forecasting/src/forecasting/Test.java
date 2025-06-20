package forecasting;

public class Test {
	 public static void main(String[] args) {
	        double currentValue = 15000; // e.g., ₹15,000
	        double growthRate = 0.2;     // 20% growth
	        int years = 3;

	        double futureValue = Forecast.predictFutureValue(currentValue, growthRate, years);
	        System.out.printf("Predicted future value after %d years: ₹%.2f%n", years, futureValue);
	    }

}
