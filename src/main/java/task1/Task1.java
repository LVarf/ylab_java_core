package task1;

import java.util.Random;

public class Task1 {
    private static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        int sumArray = 0;
        int min, max;
        double average;

        int[][] array = getRandomArray(ARRAY_LENGTH);

        min = max = array[0][0];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            for (int j = 0; j < ARRAY_LENGTH; j++) {
                if(array[i][j] < min)
                    min = array[i][j];
                if(array[i][j] > max)
                    max = array[i][j];
                sumArray += array[i][j];
            }
        }

        average = sumArray / (double) (ARRAY_LENGTH * ARRAY_LENGTH);

        System.out.printf("Min = %d, max = %d, average = %1.2f", min, max, average);
    }

    
    public static int[][] getRandomArray(int length) {
        Random random = new Random();

        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = random.nextInt(0, 100);
            }
        }
        return array;
    }
}
