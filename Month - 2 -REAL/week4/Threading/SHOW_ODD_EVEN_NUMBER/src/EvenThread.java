public class EvenThread extends Thread {
    private String name;

    public EvenThread() {

    }

    public EvenThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(this.name + ": " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
