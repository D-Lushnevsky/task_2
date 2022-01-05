package vector;

import java.util.Arrays;

public class MainVector {
    public static void main(String args[]) {

        Vectors vector1 = new Vectors(2.3, 3.75, 15.657);
        Vectors vector2 = new Vectors(3.44, 5, 1.125);

        System.out.println("Vector length" + vector1.vectorLength(vector1));
        System.out.println("Scalar prod" + Vectors.scalarProd(vector1, vector2));

        System.out.println("Vectors prod: " + Vectors.vectorsProd(vector1, vector2).x + "  " +
                Vectors.vectorsProd(vector1, vector2).y + "  " + Vectors.vectorsProd(vector1, vector2).z);

        System.out.println("Vectors cos " + Vectors.cosAngle(vector1, vector2));

        System.out.println("Vectors sum: " + Vectors.vectorsSum(vector1, vector2).x + "  " +
                Vectors.vectorsSum(vector1, vector2).y + "  " + Vectors.vectorsSum(vector1, vector2).z);

        System.out.println("Vectors diff: " + Vectors.vectorsDiff(vector1, vector2).x + "  " +
                Vectors.vectorsDiff(vector1, vector2).y + "  " + Vectors.vectorsDiff(vector1, vector2).z);

        int n = 5;

        Vectors[] array = new Vectors[n];
        array = Vectors.generateArray(n);
        System.out.println("Random vector array");

        for (int i = 0; i < n; i++) {
            System.out.println("Vector " + (i + 1) + ": x " + array[i].x + "y " + array[i].y + "z " + array[i].z);
           // System.out.println(array[i].y);
           // System.out.println(array[i].z);
        }

    }
}
