package com.propintellect.in.controller;

public class Banner {
	
	private int id;

	private String image;	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	private String caption1;
	
	private String caption2;

	private String caption3;

	private String caption4;

	private String typeofprop;

	private String price;

	private String sqft;

    private String propLink;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Banner() {}
	
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
