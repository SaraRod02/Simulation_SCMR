public class SimpleLinearRegression {
    public static void main(String[] args) {

        // Data Set
        double[] x = {23, 26, 30, 34, 43, 48, 52, 57};
        double[] y = {651, 762, 856, 1063, 1190, 1298, 1421, 1440};

        int n = x.length;

        // Summations
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        // Calculate beta_1 (regression coefficient) and beta_0 (intercept)
        double beta1 = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double beta0 = (sumX2 * sumY - sumX * sumXY) / (n * sumX2 - sumX * sumX);

        // Regression equation
        System.out.printf("Regression equation: y = %.2f + %.2fx\n", beta0, beta1);

        // Specific prediction of x
        double xPred = 57.5;
        double yPred = beta0 + beta1 * xPred;
        System.out.printf("\nFor x = %.2f, the prediction for y is: %.2f\n", xPred, yPred);
    }
}
