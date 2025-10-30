package ex12;

public class Car {

	private String color;
	private String gearType;
	private int door; 

	Car(){
		this.color = "white";
		this.gearType = "auto";
		this.door = 4;
	}
	
	Car(String color){
		this.color = color;
		this.gearType = "auto";
		this.door = 4;
	}

	Car(String color, String gearType){
		this.color = color;
		this.gearType = gearType;
		this.door = 4;
	}
	
	Car(String color, String gearType, 
			int door){
	   this.color = color;
	   this.gearType = gearType;
	   this.door = door;
	}

}
