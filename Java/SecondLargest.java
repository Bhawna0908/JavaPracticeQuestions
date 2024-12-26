import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the list
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        // Input the elements of the list
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Call method to find the second largest number
        int secondLargest = findSecondLargest(numbers);

        // Output the result
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("No second largest number exists.");
        }

        scanner.close();
    }

    // Method to find the second largest number
    public static int findSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;      // Initialize largest as the smallest integer
        int secondLargest = Integer.MIN_VALUE; // Initialize second largest as the smallest integer

        for (int num : numbers) {
            if (num > largest) {
                // Update second largest, then largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                // Update second largest if it's smaller than largest but greater than current second largest
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
