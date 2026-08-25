public class Rectangle extends Shape{

    public static final String MAIN = "\u001B[97m";
    public static final String GREEN = "\u001B[32m";

    private double width;
    private double length;

    public Rectangle(){
        width=1.0;
        length=1.0;
        System.out.print(MAIN);
    }

    public Rectangle(double width , double length){
        this.width=width;
        this.length=length;
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

    public  double getPerimeter(){
        return (2*(length+width));
    }

    public String toString(){
        return ("A Rectangle with width:"+getWidth()+", and length="+getLength()+", "+
                "\nwhich is subclass of "+ getClass().getSuperclass().getSimpleName() + ", " +
                "\nwhere " +GREEN+ super.toString() +MAIN+ " is the output of " +
                "\nthe toString() method from the superclass." );
    }
}
