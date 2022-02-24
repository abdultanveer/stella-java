package method.reference;

public class LifeWithoutMethodRef {
	
	public static void main(String[] args) {
		Sayable sayable = new SayableImpl();
		sayable.say();
		
		Sayable sayable2 = MethodReference::saySomething;
		sayable2.say();
	}

}
