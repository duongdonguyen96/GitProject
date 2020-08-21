import java.util.Arrays;

public class Noibot {
    public static void main(String[] args) {

        int[] list = {100, -100, 200, -200, 10, 20, 50, -10, 0, -10, 300, 0, 0, -5, -7};
        System.out.println("Mang ban dau :");
        System.out.println(Arrays.toString(list));
        sapXepNoiBot(list);
        System.out.println("Sap xep tu be den lon: ");
        System.out.println(Arrays.toString(list));


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

