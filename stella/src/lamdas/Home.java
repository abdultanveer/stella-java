package lamdas;

public class Home {
	
	public static void main(String[] args) {
		/*
		 * MyAppliance myAppliance = new MyAppliance(); myAppliance.switchOne();
		 */
		SbListener sbListener = ()->{System.out.println("my fan is on");};
		sbListener.switchOne();
	}

}
