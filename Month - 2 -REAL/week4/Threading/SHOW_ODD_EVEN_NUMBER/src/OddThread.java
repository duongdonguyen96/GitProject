public class OddThread extends Thread {
    private String name;

    public OddThread() {

    }

    public OddThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0) {
                System.out.println(this.name + ": " + i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
