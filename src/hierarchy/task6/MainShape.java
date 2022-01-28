package hierarchy.task6;

public class MainShape {
    public static void main(String args[]) {
        Pyramid myPyramid = new Pyramid(3.45, 5.23);
        Cylinder myCylinder = new Cylinder(2.55, 6.13);
        Box myBox = new Box(255.85);


        System.out.println(myBox.add(myPyramid));
        System.out.println(myBox.add(myCylinder));
        System.out.println(myBox.add(myPyramid));
        System.out.println(myBox.add(myCylinder));

    }
}
