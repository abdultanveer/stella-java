package method.reference;

import java.util.function.Supplier;

public class LifeWithoutSupplier {
	public static void main(String[] args) {
		OtpSupplier otpSupplier = new OtpSupplier();
		System.out.println(otpSupplier.get());
		
		Supplier<Double> doubleSupplier = ()-> Math.random();
		System.out.println(doubleSupplier.get());
	}

}
