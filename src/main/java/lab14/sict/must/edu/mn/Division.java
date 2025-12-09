package lab14.sict.must.edu.mn;

public class Division {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero!");
        }
        return a / b;
    }
}