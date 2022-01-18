package arrays.task4;
    /*
    Класс для решения задачи №1
     */
public class Elements {
    private double[] values ;
    private double[] valueWeights;

    public Elements (double[] value, double[] valueWeight) {
        this.values = value;
        this.valueWeights = valueWeight;
    }

    public double elementsReturn () {   // алгоритм после Math.random не правильный переделать
        double probability = Math.random();
        double sum = 0;
        for (double num: valueWeights) {
            sum += num;
        }

        if (probability < valueWeights[0] / sum) {
            return values[0];
        } else if (probability < valueWeights[1] / sum) {
            return values[1];
        } else if (probability < valueWeights[2] / sum) {
            return values[2];
        } else if (probability < valueWeights[3] / sum) {
            return values[3];
        }

        return values[4];
    }
}
