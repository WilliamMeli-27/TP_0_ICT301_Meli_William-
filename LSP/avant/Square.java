package LSP.avant;

public class Square  extends Rectangle {

    @Override
    public void setWidth (int width) {
        super.setWidth(width);
        super.setHeight(height);
    }

    public void setHeight (int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
