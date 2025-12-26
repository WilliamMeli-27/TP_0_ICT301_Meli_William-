package LSP.avant;

public class Main {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire du Rectangle = "+rectangle.getArea());

        Rectangle rectangle1 = new Square();
        rectangle1.setHeight(5);
        rectangle1.setWidth(4);
        System.out.println("Aire du carre ="+rectangle1.getArea());
    }
}
