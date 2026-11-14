import java.util.*;

// Write the complete Rectangle class here.

class Rectangle {
    private double length;
    private double width;
    private double area;
    private String color;

    public void set_length(double l) {
        this.length = l;
    }

    public void set_width(double w) {
        this.width = w;
    }

    public void set_color(String c) {
        this.color = c;
    }

    public void find_area() {
        this.area = this.length * this.width;
    }

    public boolean matches(Rectangle other) {
        return this.area == other.area && this.color.equals(other.color);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            double l1 = sc.nextDouble();
            double w1 = sc.nextDouble();
            String c1 = sc.next();

            double l2 = sc.nextDouble();
            double w2 = sc.nextDouble();
            String c2 = sc.next();

            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle();

            r1.set_length(l1);
            r1.set_width(w1);
            r1.set_color(c1);
            r1.find_area();

            r2.set_length(l2);
            r2.set_width(w2);
            r2.set_color(c2);
            r2.find_area();

            System.out.println(
                r1.matches(r2)
                    ? "Matching Rectangles"
                    : "Non-Matching Rectangles"
            );
        }

        sc.close();
    }
}
