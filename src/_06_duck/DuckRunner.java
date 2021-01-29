package _06_duck;

public class DuckRunner {
	public static void main(String[] args) {
		Duck daffy = new Duck ("donuts", 5);
		Dog maggi = new Dog ("Me", 4);
		maggi.run();
		maggi.bark();
	}
}
