public class Rectangle {
    int height;
    int width;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return height * width;

    }

    public int getPerimeter() {
        return (height + width) * 2;
    }
    public String display(){
        return "Rectangle[" + "width=" + width + ", height=" + height + "]";
    }

}
