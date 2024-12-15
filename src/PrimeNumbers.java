// To find 3 prime numbers between a range of numbers

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 10; i <= 50; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
                if(count == 3) {
                    break;
                }
            }
        }
        System.out.println("Total prime numbers found are: " + count);
    }
    public static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
