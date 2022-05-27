package oops;

class SingleObject {
	private static SingleObject so = null;

	private SingleObject() {
	}

	public static SingleObject getSingleObject() {
		if (so == null) {
			so = new SingleObject();
		} else {
			System.out.println("You have already create object");
		}

		return so;
	}
}

public class Singleton {

	public static void main(String[] args) {
		// SingleObject s = new SingleObject();
		SingleObject s1 = SingleObject.getSingleObject();
		System.out.println(s1);

		SingleObject s2 = SingleObject.getSingleObject();
		System.out.println(s2);

	}

}
