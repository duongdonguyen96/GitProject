import java.util.Arrays;

public class BinarySearch {
    static int[] list = {79, 66, 69, 11, 10, 45, 50, 7, 60, 4, 70, 2};

    public static void main(String[] args) {
        System.out.println("Mang ban dau ");
        System.out.println(Arrays.toString(list));
        System.out.println("Da sap xep");
        sapXepChen(list);
        System.out.println(Arrays.toString(list));
        System.out.println("_______________________");

        System.out.println(timKiemNhiPhan(list, 2));  /* 0 */
        System.out.println(timKiemNhiPhan(list, 11)); /* 4 */
        System.out.println(timKiemNhiPhan(list, 79)); /*11 */
        System.out.println(timKiemNhiPhan(list, 1));  /*-1 */
        System.out.println(timKiemNhiPhan(list, 5));  /*-1 */
        System.out.println(timKiemNhiPhan(list, 80)); /*-1 */
    }


    public static void sapXepChen(int[] array) {
        int i;
        int k;
        for (i = 1; i < array.length; i++) {
            int currentElement = array[i];
            for (k = i - 1; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }


    public static int timKiemNhiPhan(int[] list, int key) {
        int low = 0;
        int hight = list.length - 1;
        while (hight >= low) {
            int mid = (hight + low) / 2;
            if (key > list[mid]) {
                low = mid + 1;
            } else if (key == list[mid]) {
                return mid;

            } else {
                hight = mid - 1;
            }
        }
        return -1;
    }
}
