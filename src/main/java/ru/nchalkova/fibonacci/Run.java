package ru.nchalkova.fibonacci;

import java.nio.file.Paths;

/**
 * Run calculating Fn fibonacci number for n in java and native code
 * */
public class Run {
	static {
		System.load(Paths.get(System.getProperty("user.dir"), "target", "libfibonacci.dylib").toString());
	}

	public static void main(String[] args) {
		FibonacciFacade f = new FibonacciFacade();

		System.out.println(f.invokeJavaFib(8));
		System.out.println(f.invokeNativeFib(8));
	}

}
