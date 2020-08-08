import java.util.Date;

public class StopWatch {
    private long starTime;
    private long endTime;


    public StopWatch() {
        Date date = new Date();
        starTime = date.getTime();

    }

    public long getStarTime() {
        return this.starTime;

    }

    public long getEndTime() {
        return this.endTime;
    }

    public void stop() {
        Date date = new Date();
        this.endTime = date.getTime();
    }

    public void start() {
        Date date = new Date();
        this.starTime = date.getTime();
    }

    public long getElapsedTime() {
        long totalTime = this.getEndTime() - this.getStarTime();
        return totalTime;
    }
}
