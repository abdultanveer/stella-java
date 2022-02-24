package method.reference;

//step over, into, return, inspect, add/remove a break point 
public class DemoDebugging {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("result is ="+ c);
		multiply(b, c); //step into -- please enter the multiply method i want to execute multiply method line by line
		
	}
	
	static int multiply(int fno, int sno) {
		//this multiply method has some 100 instructions
		//step return means im done please return to the line no which invoked this multiply method
		for(int i=1; i<10;i++) {
			int j = i *5 +10-2;
		}
		return fno * sno;
	}

}
