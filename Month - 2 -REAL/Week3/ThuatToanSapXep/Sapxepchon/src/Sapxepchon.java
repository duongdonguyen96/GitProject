import java.util.Arrays;

public class Sapxepchon {
    public static void main(String[] args) {

        int[] list = {20, 50, 10, 64, 2, 100, 40, 24, 25, 65, 65, 65};
        System.out.println("Mang ban dau: ");
        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println("Mang da sap xep");
        System.out.println(Arrays.toString(list));

    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMaxIndex = i;
            int currentMax = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] > currentMax) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
