package beans;

public class Car {

	private String brand;
	private String carName;
	private int cost;
	private Engine engineType;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Engine getEngineType() {
		return engineType;
	}
	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", carName=" + carName + ", cost=" + cost + ", engineType=" + engineType + "]";
	}
	
}
