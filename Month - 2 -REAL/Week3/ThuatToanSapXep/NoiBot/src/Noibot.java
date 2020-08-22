import java.util.Arrays;

public class Noibot {
    public static void main(String[] args) {

        int[] array = {100, 2, 5, 10, 20, 50, 200, 500};
        System.out.println("Mang ban dau: ");
        System.out.println(Arrays.toString(array));
        System.out.println("_________________");
        sapXepNoiBot(array);
        System.out.println("Mang da sap xep");
        System.out.println(Arrays.toString(array));

    }

    public static void sapXepNoiBot(int[] array) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

}
