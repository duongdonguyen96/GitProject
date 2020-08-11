public class Point {
    private float x = 0;
    private float y = 0;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = {this.getX(), this.getY()};
        return array;
    }

    @Override
    public String toString() {
        String text = "X: " + this.getX() + " Y: " + getY();
        return text;
    }

}
