package com.ecommerce.model.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ecommerce.model.product.ProductDetail;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class StringToProductDetailConverter implements Converter<String, ProductDetail> {

	@Autowired
	private ObjectMapper objectMapper;


	@Override
	public ProductDetail convert(String source) {
		try {
			return objectMapper.readValue(source, ProductDetail.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
