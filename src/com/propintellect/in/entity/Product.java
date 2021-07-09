package com.propintellect.in.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column(name="p_id")
	@GeneratedValue
	private Integer pid;

	@Column(name="image_name")
	private String imageName;

	@Column(name="product_type")
	private String itemContent;

	@Column(name="product_name")
	private String productName;

	@Column(name="price")
	private String itemPrice;
	
	@Column(name="size")
	private String size;
	
    @Column(name="description")
    private String description;
 
	@Column(name="product_data")
	private byte[] productData;

	public byte[] getProductData() {
		return productData;
	}

	public void setProductData(byte[] productData) {
		this.productData = productData;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getItemContent() {
		return itemContent;
	}

	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String string) {
		this.itemPrice = string;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
