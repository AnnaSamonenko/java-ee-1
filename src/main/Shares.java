package main;

public class Shares {
	private int id;
	private String name;
	private double price;
	private String type;

	public Shares(String name, double price, String type) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setManufacturer(String type) {
		this.type = type;
	}
}
