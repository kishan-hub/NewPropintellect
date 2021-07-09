package com.propintellect.in.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banner")
public class Banner {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="image")
	private String image;
	
	@Column(name="caption1")
	private String caption1;
	
	@Column(name="caption2")
	private String caption2;
	
	@Column(name="caption3")
	private String caption3;
	
	@Column(name="caption4")
	private String caption4;
	
	@Column(name="typeofprop")
	private String typeofprop;
	
	@Column(name="price")
	private String price;
	
	@Column(name="sqft")
	private String sqft;
	
	@Column(name="proplink")
	private String propLink;

	public Banner() {}
	
	public Banner(String image, String caption1, String caption2, String caption3, String caption4, String typeofprop,
			String price, String sqft, String propLink) {
		this.image = image;
		this.caption1 = caption1;
		this.caption2 = caption2;
		this.caption3 = caption3;
		this.caption4 = caption4;
		this.typeofprop = typeofprop;
		this.price = price;
		this.sqft = sqft;
		this.propLink = propLink;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCaption1() {
		return caption1;
	}

	public void setCaption1(String caption1) {
		this.caption1 = caption1;
	}

	public String getCaption2() {
		return caption2;
	}

	public void setCaption2(String caption2) {
		this.caption2 = caption2;
	}

	public String getCaption3() {
		return caption3;
	}

	public void setCaption3(String caption3) {
		this.caption3 = caption3;
	}

	public String getCaption4() {
		return caption4;
	}

	public void setCaption4(String caption4) {
		this.caption4 = caption4;
	}

	public String getTypeofprop() {
		return typeofprop;
	}

	public void setTypeofprop(String typeofprop) {
		this.typeofprop = typeofprop;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSqft() {
		return sqft;
	}

	public void setSqft(String sqft) {
		this.sqft = sqft;
	}

	public String getPropLink() {
		return propLink;
	}

	public void setPropLink(String propLink) {
		this.propLink = propLink;
	}

}
