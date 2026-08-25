package Day2.Exercise;

public class Shape {

    public static final String MAIN = "\u001B[97m";

    private String color;
    private boolean filled;

    public Shape(){
        System.out.print(MAIN);
        color="green";
        filled=true;

    }

    public Shape(String color , boolean filled){
        System.out.print(MAIN);

        this.color=color;
        this.filled=filled;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString(){
        return "A Shape with color of " + getColor() + " and " + (isFilled()? "filled" : "Not filled" );
    }

}
