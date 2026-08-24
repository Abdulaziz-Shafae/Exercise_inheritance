package Day2;

public class Circle extends Shape {

    public static final String MAIN = "\u001B[97m";

    private  double radius;

    public Circle(){
        System.out.print(MAIN);
    }
    public Circle(String color, boolean filled , double radius){
        super(color,filled);
        System.out.print(MAIN);

        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(double radius){
        return (3.14*radius*radius);
    }

    public double getParameter(double radius){
        return (2*3.14*radius);
    }

    public String toString(){
        return ("   the radius is: " + radius +
                "\n   the color is: " + super.getColor() +
                "\n   is filled? " + (isFilled()? "yes" : "no") +
                "\n   the area is: " + getArea(radius)+
                "\n   the parameter is: " + getParameter(radius));

    }

}
