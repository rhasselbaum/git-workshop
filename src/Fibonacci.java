/**
 * Git workshop tutorial.
 */

/**
 * Simple recursive algorithm to print the Fibonacci sequence up to a specified length.
 * Call it like: 
 * <pre>
 * java Fibonacci &lt;n&gt;
 * </pre>
 * 
 * For example:
 * <pre>
 * java Fibonacci 7
 * </pre>
 * Prints:
 * <pre>
 * 1:1
 * 2:1
 * 3:2
 * 4:3
 * 5:5
 * 6:8
 * 7:13
 * </pre>
 */
public class Fibonacci {

    /**
     * Find the nth number in the Fibonacci sequence.
     * @param n The position in the sequence.
     * @return The nth number.
     */
    public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    /**
     * Entry point.
     * @param args Command line args.
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
        	System.out.println(i + ":" + fib(i));
        }
        System.exit(0);
    }

}
