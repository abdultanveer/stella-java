package method.reference;

public class PrintableImpl implements Printable{

	@Override
	public Printer print() {
		return new Printer();
	}

}
