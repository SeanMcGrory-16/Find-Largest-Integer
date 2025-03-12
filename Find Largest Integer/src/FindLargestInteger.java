public class FindLargestInteger {

    public static int findLargest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = numbers[0]; // Assume first element is the largest
        for (int num : numbers) {
            if (num > max) {
                max = num; // Update max if a larger number is found
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 99, 54, 32}; // Example array
        int largest = findLargest(numbers);
        System.out.println("The largest number in the array is: " + largest);
    }
}
