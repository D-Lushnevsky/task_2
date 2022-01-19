package vector;

public class Vectors {
    private final double x;
    private final double y;
    private final double z;

    public double[] number;

    public Vectors(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.number = null;
    }

    public Vectors (double[] number) {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        double[] number1 = number;
    }

    public String toString() {
        return  x + "x; " + y + "y; " + z + "z; " ;
    }

    public double toString(int i) {
        return number[i];
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProd(Vectors vec2) {
        return (x * vec2.x) + (y * vec2.y) + (z * vec2.z);
    }

    public Vectors vectorsProd(Vectors vec2) {

        double x = y * vec2.z - z * vec2.y;
        double y = z * vec2.x - x * vec2.z;
        double z = x * vec2.y - y * vec2.x;

        return new Vectors(x, y, z);
    }

    public double cosAngle(Vectors vec2) {
        double cos = scalarProd(vec2) / (length() * vec2.length());
        return cos;
    }

    public Vectors vectorsSum(Vectors vec2) {

        double x1 = x + vec2.x;
        double y1 = y + vec2.y;
        double z1 = z + vec2.z;

        return new Vectors(x1, y1, z1);
    }

    public Vectors vectorsDiff(Vectors vec2) {

        double x1 = x - vec2.x;
        double y1 = y - vec2.y;
        double z1 = z - vec2.z;

        return new Vectors(x1, y1, z1);
    }

    public static Vectors[] generateArray (int n) {
        Vectors[] array = new Vectors[n];
        //Vectors randomVector;
        for (int i = 0; i < n; i++) {
            array[i] = new Vectors((((Math.random()) * 2) - 1) * 100, (((Math.random()) * 2) - 1) * 100,
                    (((Math.random()) * 2) - 1) * 100);
        }
        return array;
    }

    public static Vectors generateArray (int m, double[] array) {
        Vectors randomVector = new Vectors(array);
        for (int i = 0; i < m; i++) {
            randomVector.number[i] = (((Math.random()) * 2) - 1) * 100;
        }
        return randomVector;
    }
}
