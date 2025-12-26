package OCP.apres;

public class Circle implements Shape{
    private double raduis;

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double calculateArea() {
        return Math.PI * raduis * raduis;
    }
}
