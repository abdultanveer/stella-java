package method.reference;


public class MyThreadStatus  implements Runnable{

	@Override
	public void run() {
		MethodReference2.ThreadStatus();
	}

}
