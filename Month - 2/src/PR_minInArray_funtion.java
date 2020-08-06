public class PR_minInArray_funtion {
    public static void main(String[] args) {
        int [] array = {2,4,5,6,7,100,999,-1,-19319};
        System.out.println(findMin(array));

    }
    public static int findMin(int [] array) {
        int min;
        min=array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
