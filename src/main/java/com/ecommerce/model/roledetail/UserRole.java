package com.ecommerce.model.roledetail;

public enum UserRole {
	
	ROLE_USER("Role for customers"),
	ROLE_OPERATOR("Role for Operators"),
	ROLE_ADMIN("Role for Admin");

	private String roleDesc;
	
	UserRole(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	
	public String getRoleDesc() {
		return roleDesc;
	}
}
