package recursion_examples;

public class RecursionProblems
{

	public static void main(String[] args)
	{
		// countDownFrom(5);
		// countUpTo(0);

		// int i = 10;
		// System.out.println(++i);
		// System.out.println(i);
		// printArray(new int[] {10,20,30,40,50}, 0);

		System.out.println("factorial(0): " + factorial(0));
		System.out.println("factorial(1): " + factorial(1));
		System.out.println("factorial(3): " + factorial(3));
		System.out.println("factorial(5): " + factorial(5));
		System.out.println("factorial(10): " + factorial(10));
		System.out.println("factorial(15): " + factorial(15));
		System.out.println("factorial(20): " + factorial(20));
		
		System.out.println();
		
		System.out.println("fibonacci(0): " + fibonacci(0));
		System.out.println("fibonacci(1): " + fibonacci(1));
		System.out.println("fibonacci(3): " + fibonacci(3));
		System.out.println("fibonacci(8): " + fibonacci(8));
		System.out.println("fibonacci(15): " + fibonacci(15));
		System.out.println("fibonacci(50): " + fibonacci(50));
		System.out.println("fibonacci(100): " + fibonacci(100));
	}

	// print n-1, n-2,..., 3, 2, 1, 0
	public static void countDownFrom(int n)
	{
		// base case?
		if (n == 0)
		{
			System.out.println(n);
			return; // exit the method
		}

		System.out.println(n);
		countDownFrom(n - 1);
	}

	public static void countUpTo(int n)
	{
		// base case?
		if (n > 5)
		{
			// System.out.println(n);
			return; // exit the method
		}

		System.out.println(n);
		countUpTo(n + 1);
	}

	// print the elements of the input array from left --> right
	public static void printArray(int[] array, int currentIndex)
	{
		// base case?
		if (currentIndex < 0 || currentIndex >= array.length)
		{
			return; // stop recursing
		}

		System.out.println(array[currentIndex]);
		printArray(array, currentIndex + 1);
	}

	public static int factorial(int n)
	{
		// base case
		if (n == 0)
		{
			return 1; // by definition
		}

		int result = n * factorial(n - 1);
		return result;
	}

	public static int fibonacci(int n)
	{
		// base case?
		if (n == 0 || n == 1)
		{
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}