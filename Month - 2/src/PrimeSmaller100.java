public class PrimeSmaller100 {
    public static void main(String[] args) {
        int number = 2;

        while(number<100) {
            if (checkPrime(number)) {
                System.out.print(number+" ");
            }
            number++;
        }

    }

    public static boolean checkPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number% i == 0) {
                return false;
            }
        }
        return true;
    }
}



