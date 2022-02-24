package method.reference;
interface Messageable{  
	Message getMessage(String msg);  
}  
class Message{  
	Message(String msg){  
		System.out.print(msg);  
	}  
}  
//functional interface -- SAM single abstract method print
interface Printable{
	Printer print();
}

class Printer{
	Printer(){
		System.out.println("this is a printer");
	}
}

public class ConstructorReference {  
	public static void main(String[] args) {  
		/*
		 * Messageable hello = Message::new; hello.getMessage("Hello");
		 */
		
		/*
		 * Printable printable = Printer::new; //if somebody calls the printables print
		 * method, please invoke the constructor of printer class printable.print();
		 */
		
		Printable printable2 = new PrintableImpl();
		printable2.print();
	}  
}  