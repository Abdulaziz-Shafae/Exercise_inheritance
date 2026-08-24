package Day2.Exercise;

public class Exercise_inheritance {

    public static final String MAIN = "\u001B[97m";
    public static final String CYAN = "\u001B[36m";
    public static final String PINK = "\u001B[95m";

    public static void main(String[] args) {
        System.out.print(MAIN);

        System.out.println("------------------- "+PINK+"Shape"+MAIN+" --------------------\n");


        System.out.println("   --------------- "+CYAN+"Circle 1"+MAIN+" ---------------");

        Circle c1 = new Circle();
        c1.setColor("red");
        c1.setFilled(true);
        c1.setRadius(4);
        System.out.println(c1.toString());

        System.out.println("   --------------- "+CYAN+"Circle 2"+MAIN+" ---------------");

        Circle c2 = new Circle();
        c2.setColor("black");
        c2.setFilled(true);
        c2.setRadius(5);
        System.out.println(c2.toString());


        System.out.println("   --------------- "+CYAN+"Circle 3"+MAIN+" ---------------");

        Circle c3 = new Circle();
        c3.setColor("blue");
        c3.setFilled(false);
        c3.setRadius(9);
        System.out.println(c3.toString());


        System.out.println("   --------------- "+CYAN+"Circle 4"+MAIN+" ---------------");

        Circle c4 = new Circle();
        c4.setColor("cyan");
        c4.setFilled(true);
        c4.setRadius(11);
        System.out.println(c4.toString());


        System.out.println("   --------------- "+CYAN+"Circle 5"+MAIN+" ---------------");

        Circle c5 = new Circle();
        c5.setColor("white");
        c5.setFilled(false);
        c5.setRadius(2);
        System.out.println(c5.toString());

        System.out.println("\n   -------------- "+PINK+"Rectangle 1"+MAIN+" -------------");

        Rectangle r1 = new Rectangle();
        r1.setColor("black");
        r1.setFilled(true);
        r1.setWidth(2);
        r1.setLength(3);
        System.out.println(r1.toString());

        System.out.println("\n   -------------- "+PINK+"Rectangle 2"+MAIN+" -------------");

        Rectangle r2 = new Rectangle();
        r2.setColor("green");
        r2.setFilled(true);
        r2.setWidth(3);
        r2.setLength(2);
        System.out.println(r2.toString());

        System.out.println("\n   -------------- "+PINK+"Rectangle 3"+MAIN+" -------------");

        Rectangle r3 = new Rectangle();
        r3.setColor("red");
        r3.setFilled(true);
        r3.setWidth(6);
        r3.setLength(7);
        System.out.println(r3.toString());

        System.out.println("\n   -------------- "+PINK+"Rectangle 4"+MAIN+" -------------");

        Rectangle r4 = new Rectangle();
        r4.setColor("yellow");
        r4.setFilled(false);
        r4.setWidth(5);
        r4.setLength(5);
        System.out.println(r4.toString());

        System.out.println("\n   -------------- "+PINK+"Rectangle 5"+MAIN+" -------------");

        Rectangle r5 = new Rectangle();
        r5.setColor("gray");
        r5.setFilled(true);
        r5.setWidth(20);
        r5.setLength(1);
        System.out.println(r5.toString());

        System.out.println("\n   --------------- "+CYAN+"Square 1"+MAIN+" ---------------");

        Square s1 = new Square();
        s1.setColor("blue");
        s1.setFilled(false);
        s1.setSide(8);
        System.out.println(s1.toString());

        System.out.println("\n   --------------- "+CYAN+"Square 2"+MAIN+" ---------------");

        Square s2 = new Square();
        s2.setColor("green");
        s2.setFilled(false);
        s2.setSide(11);
        System.out.println(s2.toString());

        System.out.println("\n   --------------- "+CYAN+"Square 3"+MAIN+" ---------------");

        Square s3 = new Square();
        s3.setColor("red");
        s3.setFilled(true);
        s3.setSide(5);
        System.out.println(s3.toString());

        System.out.println("\n   --------------- "+CYAN+"Square 4"+MAIN+" ---------------");

        Square s4 = new Square();
        s4.setColor("black");
        s4.setFilled(true);
        s4.setSide(2);
        System.out.println(s4.toString());

        System.out.println("\n   --------------- "+CYAN+"Square 5"+MAIN+" ---------------");

        Square s5 = new Square();
        s5.setColor("cyan");
        s5.setFilled(false);
        s5.setSide(6);
        System.out.println(s5.toString());


    }
}
