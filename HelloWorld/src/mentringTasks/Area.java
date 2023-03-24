package mentringTasks;

public class Area {
    /*
        Write a program to print the area of a rectangle by creating a class named ‘Area’
        having two methods. First method named as ‘setDim’ takes length and breadth of rectangle
        as parameters and the second method named as ‘getArea’ returns the area of the rectangle.
        Length and breadth of rectangle are entered through keyboard.
     */

    double l;
    double w;
    public void setDim(double l, double w){
        this.l=l;
        this.w=w;

    }
    public double getArea(){

        double areaOfRectangle= l * w;
        return areaOfRectangle;
    }

    public static void main(String[] args) {
        Area area1=new Area();
        area1.setDim(4,5);
        System.out.println(area1.getArea());
    }
}
