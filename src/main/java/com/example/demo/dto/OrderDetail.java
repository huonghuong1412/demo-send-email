package com.example.demo.dto;

public class OrderDetail {
	private String name;
	private Long price;
	private Integer quantity;
	private Long sub_total;

	public OrderDetail() {
		super();
	}

	public OrderDetail(String name, Long price, Integer quantity, Long sub_total) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.sub_total = sub_total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getSub_total() {
		return sub_total;
	}

	public void setSub_total(Long sub_total) {
		this.sub_total = sub_total;
	}

}
