public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(4f, 6f, 8f, 3f);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);

    }
}