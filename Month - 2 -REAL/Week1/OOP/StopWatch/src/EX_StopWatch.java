import java.util.Arrays;

public class EX_StopWatch {
    public static void main(String[] args) {
        StopWatch test = new StopWatch();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        test.start();
        System.out.println("thoi gian bat dau: " + test.getStarTime());
        System.out.println("Mang da sap xep: " + Arrays.toString(selectionSort(array)));
        test.stop();
        System.out.println("thoi gian ket thuc: " + test.getEndTime());
        System.err.println("Tong thoi gian: " + test.getElapsedTime());

    }


    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
