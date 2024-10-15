public class Shopping {

    // 1. Billigste Tastatur finden
    public int findCheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];
        for (int price : keyboards) {
            if (price < min) {
                min = price;
            }
        }
        return min;
    }

    // 2. Teuerster Gegenstand
    public int findMostExpensiveItem(int[] keyboards, int[] usbs) {
        int maxKeyboard = findMax(keyboards);
        int maxUsb = findMax(usbs);
        return Math.max(maxKeyboard, maxUsb);
    }

    // Hilfsmethode zum Finden des Maximums
    private int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 3. Teuerstes USB-Laufwerk innerhalb des Budgets
    public int findMostExpensiveUsb(int[] usbs, int budget) {
        int maxAffordable = -1;
        for (int price : usbs) {
            if (price <= budget && price > maxAffordable) {
                maxAffordable = price;
            }
        }
        return maxAffordable;
    }

    // 4. Maximales Budget ausgeben
    public int findMaxSpend(int[] keyboards, int[] usbs, int budget) {
        int maxSpend = -1;
        for (int keyboard : keyboards) {
            for (int usb : usbs) {
                int total = keyboard + usb;
                if (total <= budget && total > maxSpend) {
                    maxSpend = total;
                }
            }
        }
        return maxSpend;
    }
}
