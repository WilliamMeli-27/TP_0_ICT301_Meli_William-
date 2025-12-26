package LSP.apres;

public class Main {
    public static void main(String[] args) {

        Shape Square = new Square(3);
        Shape rectangle = new Rectangle(3,4);
        System.out.println("Square Area : "+Square.getArea());
        System.out.println("Rectangle Area : "+rectangle.getArea());
    }
}
