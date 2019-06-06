import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=sc.nextDouble();
        System.out.println("Enter b: ");
        double b=sc.nextDouble();
        System.out.println("Enter c: ");
        double c=sc.nextDouble();
        Account quaraticEquation=new Account(a,b,c);
        double delta=quaraticEquation.getDiscriminant();
        if (delta>0) {
            System.out.println("Equation has two root: "+quaraticEquation.getRoot1()+" and "+quaraticEquation.getRoot2());
        } else if (delta==0) {
            System.out.println("Equation has double root: "+quaraticEquation.getRoot1());
        } else {
            System.out.println("Equation has no real root.");
        }

    }
}
