public class RunProgram {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization(50);
        OptimizedPrimeFactorization op = new OptimizedPrimeFactorization(50);

        Thread thread1 = new Thread(lazy);
        Thread thread2 = new Thread(op);

        thread2.start();
        thread1.start();

    }
}
