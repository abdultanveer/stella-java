package method.reference;

import java.util.function.Supplier;

public class OtpSupplier implements Supplier<Double>{

	@Override
	public Double get() {
		return Math.random();
	}

}
