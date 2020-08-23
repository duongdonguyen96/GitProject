import java.util.Arrays;

public class ThuatToanTimKiem_Dequy {
    public static void main(String[] args) {
        int[] array = {-10, 20, 50, -100, 0, -50, 40, 80, 100};
        System.out.println("mang ban dau : " + Arrays.toString(array));
        sapXepChon(array);
        System.out.println("mang da sap xep: " + Arrays.toString(array));


        int low = 0;
        int hight = array.length - 1;

        System.out.println("Key 50 : " + thuatToanTimKiemDeQuy(array, low, hight, 50));
        System.out.println("Key -50 : " + thuatToanTimKiemDeQuy(array, low, hight, -50));
        System.out.println("Key 0 : " + thuatToanTimKiemDeQuy(array, low, hight, 0));
        System.out.println("Key -100: " + thuatToanTimKiemDeQuy(array, low, hight, -100));
        System.out.println("Key 500 :" + thuatToanTimKiemDeQuy(array, low, hight, 500));
        System.out.println("Key 80 :" + thuatToanTimKiemDeQuy(array, low, hight, 80));


    }


    public static void sapXepChon(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMinIndex = i;
            for (int k = i + 1; k < array.length; k++) {
                if (array[currentMinIndex] > array[k]) {
                    currentMinIndex = k;
                }
            }
            if (currentMinIndex != i) {
                int temp = array[currentMinIndex];
                array[currentMinIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    public static int thuatToanTimKiemDeQuy(int[] array, int low, int hight, int key) {
        int mid = (low + hight) / 2;

        if (hight >= low) {
            if (array[mid] == key) {
                return mid;
            } else if (key > array[mid]) {
                return thuatToanTimKiemDeQuy(array, mid + 1, hight, key);
            } else if (key < array[mid]) {
                return thuatToanTimKiemDeQuy(array, low, mid - 1, key);
            }

        }

        return -1;

    }
}
