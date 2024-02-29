public class MathOperations {

    // Method to calculate the sum of squares
    public static int sumOfSquares(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num * num;
        }
        return sum;
    }

    // Method to calculate the product of elements
    public static int productOfElements(int[] nums) {
        int product = 1;
        for (int num : nums) {
            product *= num;
        }
        return product;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate and print the sum of squares
        int sum = sumOfSquares(numbers);
        System.out.println("Sum of Squares: " + sum);

        // Calculate and print the product of elements
        int product = productOfElements(numbers);
        System.out.println("Product of Elements: " + product);
    }
}
