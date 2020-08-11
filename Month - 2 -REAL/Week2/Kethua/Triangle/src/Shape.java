public class Shape {
    protected String color = "Black";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String text = "color is: " + this.getColor();
        return text;
    }
}
