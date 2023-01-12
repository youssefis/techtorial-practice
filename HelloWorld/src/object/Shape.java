package object;

public class Shape {
    // calculate perimeter of rectangle
    //width, length 2*(l+w)
    //int w=5, l=10, p=0;
    //p=2*(w+l);

    public void perimeterCalculator(int width,int length){
        int perimeter= 2*(width+length);
        System.out.println("the perimeter of the rectangle is: "+ perimeter);
    }
    // create a method that will calculate the area of triangle

    // this method is to calculate the area of a triangle
    public void areaOfTriangleCalculator(double b, double h){

        double area=(b*h)/2;
        System.out.println("Area of triangle is: "+area);

    }



}
