package com.ecommerce.model.product;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection="productDetail")
public class ProductDetail {
	
	@Id
	@JsonIgnore
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
	private String category;
	
	private ProductImage productImage;
	
	@CreatedDate
	private Date createdTs;
	
	@LastModifiedDate
	private Date updatedTs;
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public ProductImage getProductImage() {
		return productImage;
	}


	public void setProductImage(ProductImage productImage) {
		this.productImage = productImage;
	}


	public Date getCreatedTs() {
		return createdTs;
	}


	public void setCreatedTs(Date createdTs) {
		this.createdTs = createdTs;
	}


	public Date getUpdatedTs() {
		return updatedTs;
	}


	public void setUpdatedTs(Date updatedTs) {
		this.updatedTs = updatedTs;
	}


	@Override
	public String toString() {
		return "ProductDetail [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", category=" + category + ", productImage=" + productImage + ", createdTs=" + createdTs
				+ ", updatedTs=" + updatedTs + "]";
	}
	
}
