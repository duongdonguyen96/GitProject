public class EX_Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("Fan1: "+ fan1.toString());


        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Fan2: "+fan2.toString());

        Fan fanmacdinh = new Fan();
        System.out.println("Fan mac dinh: "+fanmacdinh);




    }
}
