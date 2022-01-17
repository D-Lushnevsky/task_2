package arrays.task4;
    /*
    Класс для решения задачи №1
     */
public class Elements {
    protected double[] values = new double[5];
    protected double[] valuesWeights = new double[5];

    protected Elements (double[] value, double[] valueWeight) {
        this.values = value;
        this.valuesWeights = valueWeight;
    }

    protected double elementsReturn (Elements e) {
        double probability = Math.random();

        if (probability < valuesWeights[0] / valuesWeights[4]) {
            return values[0];
        } else if (probability < valuesWeights[1] / valuesWeights[4]) {
            return values[1];
        } else if (probability < valuesWeights[2] / valuesWeights[4]) {
            return values[2];
        } else if (probability < valuesWeights[3] / valuesWeights[4]) {
            return values[3];
        }

        return values[4];
    }
}
