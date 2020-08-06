
public class Prime_20 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while(count <20) {
            if (checkPrime(number)) {
                System.out.print(number+" ");
                count++;
            }
            number++;
        }

    }

    public static boolean checkPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
