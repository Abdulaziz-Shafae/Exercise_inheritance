package Day2;

public class Exercise_inheritance {

    public static final String MAIN = "\u001B[97m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        System.out.print(MAIN);

        System.out.println("------------------- "+CYAN+"Shape"+MAIN+" --------------------\n");


        System.out.println("   ---------------- "+CYAN+"Circle"+MAIN+" ----------------");

        Circle c1 = new Circle();
        c1.setColor("red");
        c1.setFilled(true);
        c1.setRadius(4);
        System.out.println(c1.toString());

        System.out.println("\n   --------------- "+CYAN+"Rectangle"+MAIN+" --------------n");

        Rectangle r1 = new Rectangle();
        r1.setColor("green");
        r1.setFilled(true);
        r1.setWidth(2);
        r1.setLength(3);
        System.out.println(r1.toString());

        System.out.println("\n   ---------------- "+CYAN+"Square"+MAIN+" ----------------n");

        Square s1 = new Square();
        s1.setColor("blue");
        s1.setFilled(false);
        s1.setSide(8);
        System.out.println(s1.toString());



    }
}
