
public class Vehicle {
static class Car {
	private	String type;
	private int no_seats;
	private String fuel;
	private String body_color;
	Car(){
		type="";
		no_seats=0;
		fuel="";
		body_color="";
	}
	Car (String type, int seats, String fuel, String body_color){
		this.type=type;
		this.no_seats=seats;
		this.fuel=fuel;
		this.body_color=body_color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public int getSeats() {
		return no_seats;
	}
	public void setSeats(int no_seats) {
		this.no_seats=no_seats;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel=fuel;
	}
	public String getBodycolor() {
		return body_color;
	}
	public void setBodycolor(String body_color) {
		this.body_color=body_color;
	}
}

	public static void main(String[] args) {
		Car myCar=new Car("VW",5,"95","red");
		Car newCar=new Car();
		System.out.println(myCar.getFuel());
		System.out.println(myCar.getBodycolor());
		System.out.println(myCar.getSeats());
		System.out.println(myCar.getType());
		newCar.setBodycolor("blue");
		newCar.setFuel("95");
		newCar.setSeats(5);
		newCar.setType("BMW");
		System.out.println(newCar.getFuel());
		System.out.println(newCar.getBodycolor());
		System.out.println(newCar.getSeats());
		System.out.println(newCar.getType());
	}

}
