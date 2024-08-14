package com.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Drink {

	@Id
	private int id;
	private String name;
	private String type;
	private int price;
	private boolean alcoholic;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAlcoholic() {
		return alcoholic;
	}

	public void setAlcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}

	public Drink() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drink(int id, String name, String type, int price, boolean alcoholic) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.alcoholic = alcoholic;
	}

	@Override
	public String toString() {
		return "Drink [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", alcoholic=" + alcoholic
				+ "]";
	}

}
