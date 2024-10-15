public class ArrayOperations {

    // 1. Maximale Zahl finden
    public int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 2. Minimale Zahl finden
    public int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 3. Maximale Summe von n-1 Zahlen
    public int findMaxSum(int[] array) {
        int sum = 0;
        int min = findMin(array); // Die kleinste Zahl weglassen
        for (int num : array) {
            sum += num;
        }
        return sum - min;
    }

    // 4. Minimale Summe von n-1 Zahlen
    public int findMinSum(int[] array) {
        int sum = 0;
        int max = findMax(array); // Die größte Zahl weglassen
        for (int num : array) {
            sum += num;
        }
        return sum - max;
    }
}
