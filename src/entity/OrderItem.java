package entity;

public class OrderItem {
	 private int orderItemId;
	    private int orderId;
	    private int productId;
	    private int quantity;

	    // Getters and Setters
	    public int getOrderItemId() {
	        return orderItemId;
	    }
	    public void setOrderItemId(int orderItemId) {
	        this.orderItemId = orderItemId;
	    }
	    public int getOrderId() {
	        return orderId;
	    }
	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }
	    public int getProductId() {
	        return productId;
	    }
	    public void setProductId(int productId) {
	        this.productId = productId;
	    }
	    public int getQuantity() {
	        return quantity;
	    }
	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }
}
