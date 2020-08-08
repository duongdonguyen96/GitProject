public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn(boolean b) {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.isOn(on)) {
            return this.getSpeed() + " " + this.getColor() + " " + this.getRadius() + " " + "Fan is on";
        } else {
            return this.getSpeed() + " " + this.getColor() + " " + this.getRadius() + " " + "Fan is off";

        }


    }
}

