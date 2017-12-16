
public class MyTask extends Thread {

	public void run() {
		System.out.println("\n\tHello from class MyTask run() method. \n\n");
	}
	public static void demo(String[] args) {
		(new Thread(new MyTask())).start();
	}

}