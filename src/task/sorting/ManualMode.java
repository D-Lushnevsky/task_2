package task.sorting;

import java.util.Scanner;

public class ManualMode implements GeneratingMode {
    Scanner scan = new Scanner(System.in);

    @Override
    public double[] generatingArray(int size) {
        double[] arrayManual = new double[size];
        for (int i = 0; i < arrayManual.length; i++) {
            System.out.println("Input a value of i");
            arrayManual[i] = scan.nextDouble();
        }
        return arrayManual;
    }
}
