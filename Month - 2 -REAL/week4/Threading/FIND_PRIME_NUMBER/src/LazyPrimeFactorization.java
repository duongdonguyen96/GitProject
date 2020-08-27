public class LazyPrimeFactorization implements Runnable {
    private int amountPrimeNumber;

    public LazyPrimeFactorization() {

    }

    public LazyPrimeFactorization(int amountPrimeNumber) {
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
            } else if (number == 2) {
                check = true;
            } else {
                for (int k = 3; k < number; k++) {
                    if (number % k == 0) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
            }
            if (check == true) {
                System.out.println("Lazy: " + number);
                count++;
            }
            number++;
        }

    }
}
