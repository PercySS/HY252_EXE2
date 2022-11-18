package csd.uoc.gr.A21;

public class Tester {
    public static void main(String[] args) {
        System.out.println(new SolidShape(2, 1, 5.1));
        System.out.println(new Sphere(2, 1, 5.12, 10));

        Drawing draw = new Drawing();

        for (int i = 0; i < 50; i++) {
            Sphere s = new Sphere(i, i, i, i);
            draw.add(s);
        }

        Drawing draw2 = new Drawing();

        for (int i = 0; i < 50; i ++) {
            if (i % 2 == 0) {
                draw2.add(new Sphere(i, i, i, i));
            } else {
                draw2.add(new Cube(i, i, i, i));
            }
        }
        System.out.println("(c-i):");
        System.out.println(draw.toString());
        System.out.println();
        System.out.println("(c-ii):");
        System.out.println(draw2.toString());



    }
}
