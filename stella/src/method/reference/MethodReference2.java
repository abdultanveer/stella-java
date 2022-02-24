package method.reference;

/*interface Runnable{
	void run();
}
*/

public class MethodReference2 {  
	
	public static void ThreadStatus(){  
		System.out.println("Thread is running...");  
	}  
	
	
	
	public static void main(String[] args) {  
		//Runnable runnable = MethodReference2::ThreadStatus;
		
		Thread t2 = new Thread(new MyThreadStatus());
		t2.start();
		
		/*
		 * Thread t2=new Thread(MethodReference2::ThreadStatus); t2.start();
		 */      
	}  
}  