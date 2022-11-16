/**
 * Fibonacci program - Both iterative and recursive versions
 * Includes potential method to display runtime through method.
 * 
 * @author Bharat Katyal
 *
 */

public class fibonacci {

	
	/**
	 * Iterative implementation for "n" Fibonacci number using standard formula
	 * 	 * 
	 * @param n
	 * @return
	 */
	public int fibonacciIterative(int n) {
		if (n <= 1) {
			return n;
		}
		int x = 0, y = 1, z = 1;
		for (int i = 0; i < n; i++) {
			x = y;
			y = z;
			z = x + y;
		}
		return x;

	}
	
	/**
	 * Test implementation for documenting runtime. 
	 * 	 * 
	 * @param startTime
	 * @return endTime
	 */
//	public long runTime(long startTime) {
//		long endTime;
//		endTime = System.nanoTime() - startTime;
//
//		
//return endTime;

//	}
	
	
	/**
	 * Test implementation for documenting runtime. 
	 * 	 * 
	 * @param startTime
	 * @return endTime
	 */
//	public long runTime(long startTime) {
//		long endTime;
//		endTime = System.nanoTime() - startTime;
//
//		
//return endTime;
//	}

	
	/**
	 * Recursive implementation for "n" Fibonacci number using standard formula
	 * 	 * 
	 * @param n
	 * @return
	 */
	public int fibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static void main(String args[]) {
		fibonacci fib = new fibonacci();
		long startTime, endTime;

		System.out.println("Iterative version:");
		startTime = System.nanoTime();
		System.out.println(fib.fibonacciIterative(5));
		endTime = System.nanoTime() - startTime;
		System.out.println("Time Took  : " + endTime);

		startTime = System.nanoTime();
		System.out.println(fib.fibonacciIterative(10));
		endTime = System.nanoTime() - startTime;
		System.out.println("Time Took  : " + endTime);

		startTime = System.nanoTime();
		System.out.println(fib.fibonacciIterative(20));
		endTime = System.nanoTime() - startTime;
		System.out.println("Time Took  : " + endTime);

		startTime = System.nanoTime();
		System.out.println(fib.fibonacciIterative(30));
		endTime = System.nanoTime() - startTime;
		System.out.println("Time Took  : " + endTime);

		System.out.println("Recursive version:");

		startTime = System.nanoTime();
		System.out.println(fib.fibonacciRecursive(5));
		endTime = System.nanoTime() - startTime;
		System.out.println("Time Took  : " + endTime);

		startTime = System.nanoTime();
		System.out.println(fib.fibonacciRecursive(10));
		endTime = System.nanoTime() - startTime;
		System.out.println("Time Took  : " + endTime);

		startTime = System.nanoTime();
		System.out.println(fib.fibonacciRecursive(20));
		endTime = System.nanoTime() - startTime;
		System.out.println("Time Took  : " + endTime);

		startTime = System.nanoTime();
		System.out.println(fib.fibonacciRecursive(30));
		endTime = System.nanoTime() - startTime;
		System.out.println("Time Took  : " + endTime);
	}
}