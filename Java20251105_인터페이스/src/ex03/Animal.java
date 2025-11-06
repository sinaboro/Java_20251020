package ex03;

public interface Animal {
	public abstract void makeSound();
	void showInfo();
	
	default void eat() {
		
	};
}
