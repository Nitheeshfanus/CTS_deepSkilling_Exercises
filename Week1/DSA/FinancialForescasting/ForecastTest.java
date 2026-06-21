
public class ForecastTest {
    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 3;

        double futureValue =
                FinancialForecast.predictFutureValue(
                        currentValue,
                        growthRate,
                        years);

        System.out.println(
                "Predicted Future Value: ₹ "
                + futureValue);
    }
}
