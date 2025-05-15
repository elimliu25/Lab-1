public class Multiples {
    public static void main(String[] args) {
        int count = 0;

        // Loop through all numbers below 1000
        for (int i = 0; i < 1000; i++) {
            // Check if the number is a multiple of 3 or 5
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        // Print the result
        System.out.println("There are " + count + " multiples of 3 or 5 below 1000.");
    }
}
