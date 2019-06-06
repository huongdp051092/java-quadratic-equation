public class Account {
    private double a, b, c;

    public Account(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return a;
    }
    double getB() {
        return b;
    }
    double getC() {
        return c;
    }
    public double getDiscriminant() {
        return Math.pow(b,2)-4*a*c;
    }
    public double getRoot1() {
        return (-b+Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public double getRoot2() {
        return (-b-Math.pow(getDiscriminant(),0.5))/(2*a);
    }
}
