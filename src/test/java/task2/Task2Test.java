package task2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void compare1() {
        int[] array = new int[]{3, 2, 3, 1, 1, 2};
        int[] sorted = new int[]{1, 1, 2, 2, 3, 3};
        assertTrue(Arrays.equals(sorted, Task2.sortWithBubble(array)));
    }

    @Test
    public void compare2() {
        int[] array = new int[] {2, 2, 2, -1, 1, 1, 1};
        int[] sorted = new int[]{-1, 1, 1, 1, 2, 2, 2};
        assertTrue(Arrays.equals(sorted, Task2.sortWithBubble(array)));
    }

    @Test
    public void compare3() {
        int[] array = new int[]{1};
        int[] sorted = new int[]{1};
        assertTrue(Arrays.equals(sorted, Task2.sortWithBubble(array)));
    }

    @Test
    public void compare4() {
        int[] array = new int[]{1, 2};
        int[] sorted = new int[]{2, 1};
        assertFalse(Arrays.equals(sorted, Task2.sortWithBubble(array)));
    }

}