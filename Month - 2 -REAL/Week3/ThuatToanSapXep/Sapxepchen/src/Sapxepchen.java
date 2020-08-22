import java.util.Arrays;

public class Sapxepchen {
    public static void main(String[] args) {
        int[] list = {100, 10, 7, 2, 5, 20, 5, 100, -1};
        System.out.println("Mang ban dau :" + Arrays.toString(list));
        sapXepchen(list);
        System.out.println("Mang da sap xep: " + Arrays.toString(list));

    }

    public static void sapXepchen(int[] array) {
        int k;
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            for (k = i - 1; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }
}


