package OCP.avant;

public class AeraCalculator {

    public double calculteArea(Object shape){
        if (shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidht()* rectangle.getHeight();
        }
        else if (shape instanceof Circle) {
            Circle circle = (Circle) shape ;
            return Math.PI * circle.getRedius() * circle.getRedius();
        }
        throw new IllegalArgumentException("Unknow shape");
    }
}

