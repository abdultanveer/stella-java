package method.reference;

import java.util.function.Supplier;

public class LifeWithoutSupplier {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		Integer integerA = Integer.valueOf(a);//converting an int to Integer object is called boxing
		Integer integerB = Integer.valueOf(b);
		int d = integerA.intValue(); //converting an Integer object to int is called unboxing

		OtpSupplier otpSupplier = new OtpSupplier();
		System.out.println(otpSupplier.get());
		
		Supplier<Double> doubleSupplier = ()-> Math.random();
		System.out.println(doubleSupplier.get());
	}

}
