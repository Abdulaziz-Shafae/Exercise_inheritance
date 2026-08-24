package Day2;

public class Rectangle extends Shape{

    public static final String MAIN = "\u001B[97m";

    private double width;
    private double length;

    public Rectangle(){
        System.out.print(MAIN);
    }
    public Rectangle(String color, boolean filled , double width , double length){
        super(color,filled);
        System.out.print(MAIN);

        this.width=width;
        this.length=length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return (length*width);
    }

    public  double getParameter(){
        return (2*(length+width));
    }

    public String toString(){
        return ("   the width is: " + width +
                "\n   the length is: " + length +
                "\n   the color is: " + super.getColor() +
                "\n   is filled? " + (isFilled()? "yes" : "no") +
                "\n   the area is: " + getArea()+
                "\n   the parameter is: " + getParameter());
    }
}
