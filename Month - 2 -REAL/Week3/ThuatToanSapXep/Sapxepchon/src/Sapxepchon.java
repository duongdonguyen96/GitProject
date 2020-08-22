import java.util.Arrays;

public class Sapxepchon {
    public static void main(String[] args) {

        int[] list = {200, 20, 50, 10, 64, 2, 100, 40, 24, 25, 65, 65, 65, 0, 1};
        System.out.println("Mang ban dau: ");
        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println("Mang da sap xep");
        System.out.println(Arrays.toString(list));

    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMaxIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] > list[currentMaxIndex]) {
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                int temp = list[currentMaxIndex];
                list[currentMaxIndex] = list[i];
                list[i] = temp;

            }
        }
    }
}

