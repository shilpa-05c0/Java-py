public class Prime {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Divisible by i, so not prime
            }
        }
        
        return true; // If no divisors found, the number is prime
    }

    public static void main(String[] args) {
        int num = 29; // Provide the number here
        
        // Check if the number is prime and print the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
