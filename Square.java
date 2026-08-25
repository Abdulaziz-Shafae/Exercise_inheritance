package Day2.Exercise;

public class Square extends Rectangle {

    public static final String MAIN = "\u001B[97m";
    public static final String PINK = "\u001B[95m";


    public Square() {
        System.out.print(MAIN);
    }

    public Square(double side) {
        System.out.print(MAIN);
        setLength(side);
        setWidth(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        System.out.print(MAIN);

    }

    // no need for them since it send the side as width and length
/*    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }*/

    public void setSide(double side) {

        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public String toString() {
        return ("A Square with side=" + getSide() + ", " +
                "\nwhich is subclass of "+ getClass().getSuperclass().getSimpleName() + ", " +
                "\nwhere " +PINK+ super.toString() +MAIN+ " is the output of " +
                "\nthe toString() method from the superclass.");
    }
}

