package stellai.interfaces;

public class GmAppliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("GM fan is on");

	}

	@Override
	public void switchTwo() {
		System.out.println("GM tubelight is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("GM bulb is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("Gm  heater is on");
		
	}

}
