// Sum 3 and 5 challenge. Sum all numbers that can be divided by both 3 and 5.

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1; count < 5 && i <= 1000; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println("Number " + i + " has met the condition");
                count++;
            }
        }
        System.out.println("Value of the sum is " + sum);
    }
}
