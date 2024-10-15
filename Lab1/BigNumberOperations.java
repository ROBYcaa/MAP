public class BigNumberOperations {

    // 1. Summe von zwei großen Zahlen
    public int[] addBigNumbers(int[] num1, int[] num2) {
        int[] result = new int[num1.length];
        int carry = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }

    // 2. Differenz von zwei großen Zahlen
    public int[] subtractBigNumbers(int[] num1, int[] num2) {
        int[] result = new int[num1.length];
        int borrow = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }

    // 3. Multiplikation einer großen Zahl mit einer Ziffer
    public int[] multiplyBigNumber(int[] num, int digit) {
        int[] result = new int[num.length];
        int carry = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            int product = num[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }
        return result;
    }

    // 4. Ganzzahlige Division einer großen Zahl durch eine Ziffer
    public int[] divideBigNumber(int[] num, int digit) {
        int[] result = new int[num.length];
        int carry = 0;
        for (int i = 0; i < num.length; i++) {
            int current = carry * 10 + num[i];
            result[i] = current / digit;
            carry = current % digit;
        }
        return result;
    }
}
