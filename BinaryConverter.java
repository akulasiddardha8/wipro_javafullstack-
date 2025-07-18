mport java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 255: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 255) {
            String binaryString = Integer.toBinaryString(number);
            String paddedBinary = String.format("%8s", binaryString).replace(' ', '0');
            System.out.println("Binary representation: " + paddedBinary);
        } else {
            System.out.println("Invalid input! Enter a number between 1 and 255.");
        }
    }
}