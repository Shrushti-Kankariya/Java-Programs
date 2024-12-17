
public class Laptop {
	int id;
	String company;
	String config;
	float price;
	
	public Laptop(int id, String company, String config, float price) {
		this.id = id;
		this.company = company;
		this.config = config;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		return "Laptop [id=" + id + ", company=" + company + ", config=" + config + ", price=" + price + "]";
	}
	
	
}
