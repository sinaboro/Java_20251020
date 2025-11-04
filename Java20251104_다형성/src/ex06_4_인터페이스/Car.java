package ex06_4_인터페이스;

public interface Car {
	
	void move();	
	
	default void stop() {
		System.out.println("---------");
	}; 
	
	public abstract void fillUp();
}
