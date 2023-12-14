package Task1;

public class Tester {
    public static void main(String[] args) {
        ComplexFactory fac = new ComplexFactory();
        Complex c1 = fac.createComplex();
        Complex c2 = fac.createComplex(2, 3);
        System.out.println(c1);
        System.out.println(c2);
    }
}
