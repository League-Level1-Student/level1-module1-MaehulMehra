package _06_duck;

public class Dog {
	private int numberOfMeals;
	private String bestFriend;
	Dog (String bestFriend, int numberOfMeals){
		this.bestFriend = bestFriend;
		this.numberOfMeals = numberOfMeals;
	}
	public void bark () {
		System.out.println("woof, woof");
	}
	public void run () {
		System.out.println("pant, pant");
	}
}
