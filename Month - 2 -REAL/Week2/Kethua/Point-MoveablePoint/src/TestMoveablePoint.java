public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1 = new MoveablePoint();
        System.out.println(moveablePoint1);
        MoveablePoint moveablePoint2 = new MoveablePoint(10.1f, 10.2f);
        System.out.println(moveablePoint2);
        MoveablePoint moveablePoint3 = new MoveablePoint(10.1f, 10.2f, 10.3f, 10.4f);
        System.out.println(moveablePoint3);
        moveablePoint3.move();
        System.out.println(moveablePoint3);
    }

}
