public class divideItselfNo {
    public int countDigits(int num) {
        int tmp = num;
        int count = 0;

        while (tmp != 0) {

            int n = tmp % 10;
            tmp /= 10;

            if (num % n == 0) {
                count++;
            }
        }

        return count;
    }
}
