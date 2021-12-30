package com.ecommerce.model.product;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ecommerce.model.userdetail.UserDetail;

@Document(collection="cartDetail")
public class CartDetail {
	
	@Id
	private String id;
	
	@DBRef
	private UserDetail userDetail;
	
	@DBRef
	private ProductDetail productDetail;
	
	private long quantity;
	
	
	
	

}
