package Day2.Exercise;

public class Circle extends Shape {

    public static final String MAIN = "\u001B[97m";
    public static final String GREEN = "\u001B[32m";

    private  double radius;

    public Circle(){
        radius=1.0;
        System.out.print(MAIN);
    }
    public Circle(double radius) {
        this.radius=radius;
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

    public double getArea(){
        return (3.14*getRadius()*getRadius());
    }

    public double getPerimeter(){
        return (2*3.14*getRadius());
    }

    public String toString(){
        return ( "A Circle with radius="+getRadius()+", " +
                "\nwhich is a subclass of " + getClass().getSuperclass().getSimpleName() + ", " +
                "\nwhere " +GREEN+ super.toString() +MAIN+ " is the output of " +
                "\nthe toString() method from the superclass." );


    }

}
