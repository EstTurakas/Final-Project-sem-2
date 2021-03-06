package ModelLayer;

import java.util.ArrayList;

public class OrderLine {

	private int orderLineId;
	private int price;
	private int amount;
	private boolean isService;
	private ArrayList<Service> services;
	private ArrayList<Item> items;

	public OrderLine(int orderLineId, int price, int amount, boolean isService) {
		this.orderLineId = orderLineId;
		this.price = price;
		this.amount = amount;
		this.isService = isService;
	}

	public void addService(Service service) {
		services.add(service);
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public int getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(int orderLineId) {
		this.orderLineId = orderLineId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isService() {
		return isService;
	}

	public void setService(boolean service) {
		isService = service;
	}

	public ArrayList<Service> getServices() {
		return services;
	}

	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}
