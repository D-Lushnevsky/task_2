package arrays.task4;

/*
Класс для решения задачи №1
 */
public class Elements {
    private double[] values;
    private double[] valueWeights;
    private double sum = 0;


    public Elements(double[] value, double[] valueWeight) {
        this.values = value;
        this.valueWeights = valueWeight;
        for (double num : valueWeights) {
            sum += num;
        }
    }

    public double randomElements() {   // алгоритм после Math.random не правильный переделать
        double probability = Math.random();
        int len = values.length;
        double initialValue = 0;
        double position = 0;
        int i = 0;

        for (i = 0; i < len; i++) {
            position = initialValue + (valueWeights[i] / sum);
            initialValue = initialValue + valueWeights[i] / sum;

            if (probability < position) {
                return values[i];
            }
        }

        throw new IllegalStateException();
    }
}
