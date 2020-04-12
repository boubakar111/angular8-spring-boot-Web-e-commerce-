package org.sid.ligthecom.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	@OneToMany(mappedBy = "order")
	private Collection<OrderItem> orderItems;
	@ManyToOne
	private Client client;
	private double totalAmount;
	@OneToOne
	private Payement payment;
	
	

	public Order() {
		super();
	}

	public Order(Long id, Date date, Collection<OrderItem> orderItems, Client client, double totalAmount,
			Payement payment) {
		super();
		this.id = id;
		this.date = date;
		this.orderItems = orderItems;
		this.client = client;
		this.totalAmount = totalAmount;
		this.payment = payment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Collection<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Collection<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Payement getPayment() {
		return payment;
	}

	public void setPayment(Payement payment) {
		this.payment = payment;
	}

}
