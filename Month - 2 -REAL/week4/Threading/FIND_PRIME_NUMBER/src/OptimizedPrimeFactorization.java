public class OptimizedPrimeFactorization implements Runnable {
    private int amountPrimeNumber;

    public OptimizedPrimeFactorization() {

    }

    public OptimizedPrimeFactorization(int amountPrimeNumber) {
        this.amountPrimeNumber = amountPrimeNumber;

    }

    @Override
    public void run() {
        int count = 0;
        int number = 0;
        boolean check = false;
        while (count < amountPrimeNumber) {
            if (number < 2) {
                check = false;
            } else {
                for (int k = 2; k < Math.abs(number); k++) {
                    if (number % k == 0) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
            }
            if (check) {
                System.out.println("Optimazed: " + number);
                count++;
            }
            number++;
        }

    }

}
