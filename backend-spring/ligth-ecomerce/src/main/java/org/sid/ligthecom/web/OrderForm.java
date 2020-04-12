package org.sid.ligthecom.web;

import java.util.ArrayList;
import java.util.List;

import org.sid.ligthecom.Entity.Client;

import lombok.Data;

@Data
public class OrderForm {

	private Client client = new Client();
	private List<OrderProduct> products = new ArrayList<>();
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<OrderProduct> getProducts() {
		return products;
	}
	public void setProducts(List<OrderProduct> products) {
		this.products = products;
	}
}

@Data
class OrderProduct {
	private Long id;
	private int quantity;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}