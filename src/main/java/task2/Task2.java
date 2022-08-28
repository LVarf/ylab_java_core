package task2;

public class Task2 {
    private static final int[] ARRAY = new int[]{5, 6, 3, 2, 5, 1, 4, 9};

    public static void main(String[] args) {
        int[] arraySorted = sortWithBubble(ARRAY);

        for (int i = 0; i < arraySorted.length; i++) {
            System.out.println(arraySorted[i]);
        }
    }

    public static int[] sortWithBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int num = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = num;
                }
            }
        }
        return array;
    }
}
