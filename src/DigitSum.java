public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(1254));
    }
    public static int sumDigits(int number) {
        if(number < 1) {
            return -1;
        }
        if(number < 10) {
            return number;
        }
        int sum = 0;
        while(number > 9) {
            sum += (number % 10);
            number = number / 10;
        }
        return sum + number;
    }
}
