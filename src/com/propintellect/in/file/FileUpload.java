package com.propintellect.in.file;

public class FileUpload {
	
	private int pId;
	
	private String imageName;
	
	private String productType;
	
	private String productName;
	
	private String price;
	
	private String size;
	
	private String description;
	
	private byte[] productData;
	
	public FileUpload() {}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

	public byte[] getProductData() {
		return productData;
	}

	public void setProductData(byte[] productData) {
		this.productData = productData;
	}
	
	

}
