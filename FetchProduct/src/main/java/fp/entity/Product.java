package fp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FetchProduct")
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "Product_Id")
	private int id;
	@Column(name = "Product_Name", nullable = false)
	private String name;
	@Column(name = "Product_Price", nullable = false)
	private double price;
	@Column(name = "Stock_Quantity", nullable = false)
	private int stockQuantity;

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

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Product(String name, double price, int stockQuantity) {
		super();
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", stockQuantity=" + stockQuantity + "]";
	}

}
