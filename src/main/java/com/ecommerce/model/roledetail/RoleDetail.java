package com.ecommerce.model.roledetail;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ecommerce.model.constants.CollectionName;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection=CollectionName.ROLE_DETAIL)
public class RoleDetail {
	
	@Id
	@JsonIgnore
	private String id;
	private UserRole name;
	private String roleDescription;
	@JsonIgnore
	@CreatedDate
	private String createdTs;
	@JsonIgnore
	@LastModifiedDate
	private String updatedTs;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public UserRole getName() {
		return name;
	}
	public void setName(UserRole name) {
		this.name = name;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public String getCreatedTs() {
		return createdTs;
	}
	public void setCreatedTs(String createdTs) {
		this.createdTs = createdTs;
	}
	public String getUpdatedTs() {
		return updatedTs;
	}
	public void setUpdatedTs(String updatedTs) {
		this.updatedTs = updatedTs;
	}
	public RoleDetail(String id, String roleId, UserRole name, String roleDescription, String createdTs,
			String updatedTs) {
		super();
		this.id = id;
		this.name = name;
		this.roleDescription = roleDescription;
		this.createdTs = createdTs;
		this.updatedTs = updatedTs;
	}
	@Override
	public String toString() {
		return "RoleDetail [id=" + id + ", roleName=" + name + ", roleDescription="
				+ roleDescription + ", createdTs=" + createdTs + ", updatedTs=" + updatedTs + "]";
	}

}
