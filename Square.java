package Day2;

public class Square extends Rectangle {

    public static final String MAIN = "\u001B[97m";

    public Square(){
        System.out.print(MAIN);
    }
    public Square(String color, boolean filled , double width , double length){
        super(color,filled,width,length);
        System.out.print(MAIN);

    }

    public void setSide(double side){
        super.setWidth(side);
    }

    public double getSide(){
        return super.getWidth();
    }

    public String toString(){
        return ("   the side is: " + getSide() +
                "\n   the color is: " + super.getColor() +
                "\n   is filled? " + (isFilled()? "yes" : "no"));
    }
}
