package multithreading;

//class Bye implements Runnable {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Bye");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

//class Tata implements Runnable {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Tata");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

public class AnonymousClassRunnable {

	public static void main(String[] args) {

		Runnable bye = new Runnable() { // anonymous class
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Bye");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Runnable tata = new Runnable() { // Anonymous class
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Tata");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t1 = new Thread(bye);
		Thread t2 = new Thread(tata);

		t1.start();
		t2.start();

	}
}
