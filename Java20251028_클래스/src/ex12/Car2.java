package ex12;

public class Car2 {

	private String color;
	private String gearType;
	private int door; 

	Car2(){
		this("white", "auto", 4);
		System.out.println("--------");
	}
	
	Car2(String color){
		this(color, "auto", 4);
	}

	Car2(String color, String gearType){
		this(color, gearType, 4);
	}
	
	Car2(String color, String gearType, 
			int door){
	   this.color = color;
	   this.gearType = gearType;
	   this.door = door;
	}

}
