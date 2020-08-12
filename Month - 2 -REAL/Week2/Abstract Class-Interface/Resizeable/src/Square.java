

public class Square extends Rectangle {
    public double side = 1.0;

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);

    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }


//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//
//    }
//
//    @Override
//    public void setLength(double size) {
//
//        setSide(length);
//    }

    @Override
    public String toString() {
        String textSquare = "A Square with side= " + this.getSide() + " which is a subclass of " + super.toString();
        return textSquare;
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.getSide() + this.getSide() * percent / 100);
    }
}
