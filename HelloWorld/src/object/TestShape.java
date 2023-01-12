package object;

public class TestShape {
    public static void main(String[] args) {

        Shape rectangle1=new Shape();
        rectangle1.perimeterCalculator(5,8);
        rectangle1.perimeterCalculator(12,20);

        Shape triangle1=new Shape();
        triangle1.areaOfTriangleCalculator(5.5,2.2);
        triangle1.areaOfTriangleCalculator(2,5);

    }
}
