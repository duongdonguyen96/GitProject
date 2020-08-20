import java.util.Arrays;

public class Sapxepchen {
    public static void main(String[] args) {
        int[] list = {100, 99, 2, 4, 5, 1, 1, 1, 1, 2, 4, 5, 6, 7, 8, 9, 100, -1};
        System.out.println("Mang ban dau :" + Arrays.toString(list));
        insertionSort(list);
        System.out.println("Mang da sap xep: " + Arrays.toString(list));


    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
