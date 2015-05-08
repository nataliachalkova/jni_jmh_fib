package ru.nchalkova.fibonacci;

/**
 * Facade for invoking private *Fib methods
 * 
 * */
public class FibonacciFacade {

	/** Java method */
	public long invokeJavaFib(int n) {
		return getJavaFib(n);
	}

	/** Java native method (JNI) */
	public long invokeNativeFib(int n) {
		return getNativeFib(n);
	}

	private long getJavaFib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be >= 0");
		}
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		long a = 1;
		long b = 0;
		long next = 0;
		for (int i = 0; i < n; i++) {
			next = a + b;
			a = b;
			b = next;
		}
		return next;
	}

	private native long getNativeFib(int n);

}