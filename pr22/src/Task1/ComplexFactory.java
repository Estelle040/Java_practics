package Task1;

public class ComplexFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex(1, 1);
    }

    @Override
    public Complex createComplex(double real, double image) {
        return new Complex(real, image);
    }
}
