package task.sorting;

import java.util.Scanner;

public class RandomMode implements GeneratingMode {
    Scanner scan = new Scanner(System.in);
    @Override
    public double[] generatingArray(GeneratingMode mode) {

        System.out.println("Input array size");
        int size = scan.nextInt();

        double[] arrayRandom = new double[size];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (((Math.random())*2)-1)*Double.MAX_VALUE;
                    //(Math.random()*Double.MAX_VALUE - Double.MIN_VALUE/2)*2;

        }
        return arrayRandom;
    }
}
