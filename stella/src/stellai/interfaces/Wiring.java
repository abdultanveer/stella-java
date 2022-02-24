package stellai.interfaces;

public class Wiring {
	public static void main(String[] args) {
		SwitchBoardListener sbl = new GmAppliances();
				//new HavellsAppliances(); //wiring
		sbl.switchOne();
		sbl.switchTwo();
		sbl.switchThree();
		sbl.switchFour();
	}

}
