package vector;

import java.util.Arrays;
import java.util.Scanner;

public class MainVector {
    public static void main(String args[]) {


        Vectors vector1 = new Vectors(2.3, 3.75, 15.657);
        Vectors vector2 = new Vectors(3.44, 5, 1.125);

        String a =vector1.toString();

        System.out.println("Vector1 length " + vector1.length());
        System.out.println("Vector2 length " + vector2.length());

        System.out.println("Scalar prod " + vector1.scalarProd(vector2));

        Vectors arithmetic = vector1.vectorsProd(vector2);
        System.out.println("Vectors prod: " + arithmetic.toString());

        System.out.println("Vectors cos " + vector1.cosAngle(vector2));

        arithmetic = vector1.vectorsSum(vector2);
        System.out.println("Vectors sum: " + arithmetic.toString());

        arithmetic = vector1.vectorsDiff(vector2);
        System.out.println("Vectors diff: " + arithmetic.toString());

        int n = 5;

        Vectors[] array = Vectors.generateArray(n);;

        System.out.println("Random vector array:");

        for (int i = 0; i < n; i++) {

            System.out.println("Vector " + (i + 1) + ": " + array[i].toString());
        }

        int m = 0;

        System.out.println("Input number dimension of Vector");
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();

        double[] numberOfDimension = new double[m];
        Vectors randomVector = Vectors.generateArray(m, numberOfDimension);

        for (int i = 0; i < m; i++) {
            System.out.println("Vector " + Arrays.toString(randomVector.number));
        }



    }
}
