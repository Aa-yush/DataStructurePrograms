package multithreading;

class One implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("One");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Two implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Two");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinMethod {
	public static void main(String args[]) throws InterruptedException {
		Runnable one = new One();
		Runnable two = new Two();

		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);

		t1.start();
		t1.join(); // t1 thread will run till end
		t2.start(); // t2 thread will wait t1 complete its job and join t1 join
					// method

		try {
			t2.join(); // Now t2 will run till end
			for (int i = 0; i < 5; i++) {
				System.out.println("main");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// main thread will wait t2 to finish
		// its job and then join t2

	}

}
