package vector;

public class Vectors {
    protected final double x;
    protected final double y;
    protected final double z;

    public Vectors(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    protected static double vectorLength(Vectors vec) {
        return Math.sqrt(vec.x * vec.x + vec.y * vec.y + vec.z * vec.z);
    }

    protected static double scalarProd(Vectors vec1, Vectors vec2) {
        return (vec1.x * vec2.x) + (vec1.y * vec2.y) + (vec1.z * vec2.z);
    }

    protected static Vectors vectorsProd(Vectors vec1, Vectors vec2) {

        double x = vec1.y * vec2.z - vec1.z * vec2.y;
        double y = vec1.z * vec2.x - vec1.x * vec2.z;
        double z = vec1.x * vec2.y - vec1.y * vec2.x;
        Vectors vectorsProd = new Vectors(x, y, z);

        return vectorsProd;
    }

    protected static double cosAngle(Vectors vec1, Vectors vec2) {
        double cos = scalarProd(vec1, vec2) / (vectorLength(vec1) * vectorLength(vec2));
        return cos;
    }

    protected static Vectors vectorsSum(Vectors vec1, Vectors vec2) {

        double x = vec1.x + vec2.x;
        double y = vec1.y + vec2.y;
        double z = vec1.z + vec2.z;
        Vectors vectorsProd = new Vectors(x, y, z);

        return vectorsProd;
    }

    protected static Vectors vectorsDiff(Vectors vec1, Vectors vec2) {

        double x = vec1.x - vec2.x;
        double y = vec1.y - vec2.y;
        double z = vec1.z - vec2.z;
        Vectors vectorsProd = new Vectors(x, y, z);

        return vectorsProd;
    }

    protected static Vectors[] generateArray (int n) {
        Vectors[] array = new Vectors[n];
        //Vectors randomVector;
        for (int i = 0; i < n; i++) {
            array[i] = new Vectors((((Math.random()) * 2) - 1) * 100, (((Math.random()) * 2) - 1) * 100,
                    (((Math.random()) * 2) - 1) * 100);
        }
        return array;
    }
}
