public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread = new EvenThread("Event thread");
        OddThread oddThread = new OddThread("Odd thread");

        oddThread.start();
        oddThread.join();

        evenThread.start();
        evenThread.join();


    }
}
