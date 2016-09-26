interface Valuable {
	public double getmoney();
}

interface Protective {
	public void beprotected();
}

class Animal {
	public String name;

	Animal(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void run() {
	};
}

class Pig extends Animal implements Valuable, Protective {
	private double value;

	Pig(String name, double value) {
		super(name);
		this.value = value;
	}

	public double getvalue() {
		return value;
	}

	public String getname() {
		return name;
		System.out.println(name);
	}

	}

	public double getmoney() {
		return 100.1;
	}

	public void beprotected() {
		System.out.println("pig is beprotected");
	}

	public void run() {
		System.out.println("pig is running");
	}
}

public class TestInterface2 {
	public static void main(String args[]) {
		Valuable v1 = new Pig("bing", 1.2);
		v1.run();
		v1.beprotected();
		System.out.println(v1.getname());

	}

}
