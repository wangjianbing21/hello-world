class SuperClass {
	int n;

	SuperClass() {

		System.out.println("superclass");
	}

	SuperClass(int n) {

		System.out.println(" SUPERCLASS " + n);
		// this.n = n;

	}
}

class SupClass extends SuperClass {
	int n;

	SupClass() {
		// super(300);
		System.out.println("supclass");

	}

	SupClass(int n) {
		super(100);
		System.out.println(" SUPCLASS " + n);
		// this.n = n;

	}
}

public class TestSuperSup {
	public static void main(String args[]) {
		SupClass sc1 = new SupClass();
		// SuperClass sp1 = new SuperClass();
		// System.out.println(sc1.n);
		SupClass sc2 = new SupClass(21);

	}

}
