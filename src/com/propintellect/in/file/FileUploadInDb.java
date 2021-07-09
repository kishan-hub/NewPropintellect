package com.propintellect.in.file;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class FileUploadInDb {
	
	static JdbcTemplate jdbcTemplateObj;
	static SimpleDriverDataSource dataSourceObj;

	// Database Configuration Parameters
	static String DB_USERNAME = "hbstudent", DB_PASSWORD = "hbstudent", DB_URL = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";

	private static SimpleDriverDataSource getDatabaseConnection()  {
		dataSourceObj = new SimpleDriverDataSource();
		try {			
			dataSourceObj.setDriver(new com.mysql.jdbc.Driver());
			dataSourceObj.setUrl(DB_URL);
			dataSourceObj.setUsername(DB_USERNAME);
			dataSourceObj.setPassword(DB_PASSWORD);
		} catch(SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return dataSourceObj;
	}

	// This Method Is Used To Save The Uploaded File In The Database
	public static void fileSaveInDb(FileUpload fileUploadObj) {

		// This Code Is Used To Set Driver Class Name, Database URL, Username & Password
		jdbcTemplateObj = new JdbcTemplate(getDatabaseConnection());

		if(null != jdbcTemplateObj) {

			// Performing The Sql 'Insert' Operation
			String sqlInsertQuery = "INSERT INTO product (image_name, product_type,product_name,price,size,description,product_data) VALUES (?, ?, ?, ?, ?, ?, ?)";
			int insertCount = jdbcTemplateObj.update(sqlInsertQuery, fileUploadObj.getImageName(),fileUploadObj.getProductType(),fileUploadObj.getProductName(),fileUploadObj.getPrice(),fileUploadObj.getSize()
					,fileUploadObj.getDescription(),fileUploadObj.getProductData());
			if(insertCount == 1) {
				System.out.println("The Uploaded File Is Successfully Saved In The Database...!" + "\n");
			} else {
				System.out.println("Error Occured While Saving The Uploaded File In The Database... Please Check...!" + "\n");
			}
		} else {
			System.out.print("Application Is Not Able To Bind With The Database! Please Check!");
		}
	}
	
	public static void fileUpdateInDb(FileUpload fileUploadObj,Integer pid) {

		// This Code Is Used To Set Driver Class Name, Database URL, Username & Password
		jdbcTemplateObj = new JdbcTemplate(getDatabaseConnection());

		if(null != jdbcTemplateObj) {
			//UPDATE PRODUCT(image_name, product_type,product_name,price,size,description,product_data) set image_name=?,product_type=?,product_name=?,price=?,size=?,description=?,product_data=? where 
			String sqlInsertQuery = "UPDATE PRODUCT(image_name, product_type,product_name,price,size,description,product_data) set image_name=?,product_type=?,product_name=?,price=?,size=?,description=?,product_data=? where p_id="+pid;
			int insertCount = jdbcTemplateObj.update(sqlInsertQuery, fileUploadObj.getImageName(),fileUploadObj.getProductType(),fileUploadObj.getProductName(),fileUploadObj.getPrice(),fileUploadObj.getSize()
					,fileUploadObj.getDescription(),fileUploadObj.getProductData());
			if(insertCount == 1) {
				System.out.println("The Uploaded File Is Successfully Saved In The Database...!" + "\n");
			} else {
				System.out.println("Error Occured While Saving The Uploaded File In The Database... Please Check...!" + "\n");
			}
		} else {
			System.out.print("Application Is Not Able To Bind With The Database! Please Check!");
		}
	}

}
