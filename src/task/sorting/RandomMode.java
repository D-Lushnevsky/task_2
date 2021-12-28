package task.sorting;


public class RandomMode implements GeneratingMode {

    @Override
    public double[] generatingArray(int size) {

        double[] arrayRandom = new double[size];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (((Math.random()) * 2) - 1) * Double.MAX_VALUE;
            //(Math.random()*Double.MAX_VALUE - Double.MIN_VALUE/2)*2;

        }
        return arrayRandom;
    }
}
