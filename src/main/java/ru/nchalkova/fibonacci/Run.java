package ru.nchalkova.fibonacci;
/**
 * Run calculating Fn fibonacci for n in java and native code
 * */
public class Run {
	static {
		System.load(System.getProperty("user.dir")+"/target/libfibonacci.dylib");
	}
	public static void main(String[] args) {
		FibonacciFacade f = new FibonacciFacade();
		
		System.out.println(f.invokeJavaFib(8));
		System.out.println(f.invokeNativeFib(8));
	}

}
