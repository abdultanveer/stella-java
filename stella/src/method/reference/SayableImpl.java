package method.reference;

public class SayableImpl implements Sayable{

	@Override
	public void say() {
		MethodReference.saySomething();
	}

}
