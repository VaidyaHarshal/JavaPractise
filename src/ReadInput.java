import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        displayMinMax();
    }

    public static void displayMinMax() {
        int minNumber = 0;
        int maxNumber = 0;
        int inputValue = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the number or any character to quit : ");
            try{
                inputValue = Integer.parseInt(sc.nextLine());
                if(count == 0 || inputValue < minNumber) {
                    minNumber = inputValue;
                }
                if(count == 0 || inputValue > maxNumber) {
                    maxNumber = inputValue;
                }
                count++;
            } catch(NumberFormatException e) {
                break;
            }
        }
        if(count > 0) {
            System.out.println("The minimum number is : " + minNumber);
            System.out.println("The maximum number is : " + maxNumber);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
