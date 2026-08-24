package Day2;

public class Shape {

    public static final String MAIN = "\u001B[97m";

    private String color;
    private boolean filled;

    public Shape(){
        System.out.print(MAIN);

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

}
