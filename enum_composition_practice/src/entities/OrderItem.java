package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice() {
		this.price = product.getPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product);
		sb.append("Quantity: " + quantity + ", ");
		sb.append("Subtotal: $" + subTotal());
		return sb.toString();
	}
	
	
}
