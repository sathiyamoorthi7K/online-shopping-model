package com.ecommerce.model.userrole;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import com.ecommerce.model.roledetail.RoleDetail;
import com.ecommerce.model.userdetail.UserDetail;

public class UserRoleDetail {
	
	@Id
	private String id;
	
	@Field(name="userDetail")
	private UserDetail userDetail;
	
	@Field(name="roleDetail")
	private List<RoleDetail> roles;	
	
	private String createTs;
	private String updatedTs;
	
	public List<RoleDetail> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleDetail> roles) {
		this.roles = roles;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	public String getCreateTs() {
		return createTs;
	}
	public void setCreateTs(String createTs) {
		this.createTs = createTs;
	}
	public String getUpdatedTs() {
		return updatedTs;
	}
	public void setUpdatedTs(String updatedTs) {
		this.updatedTs = updatedTs;
	}
	public UserRoleDetail(String id, UserDetail userDetail, List<RoleDetail> roles, String createTs, String updatedTs) {
		super();
		this.id = id;
		this.userDetail = userDetail;
		this.roles = roles;
		this.createTs = createTs;
		this.updatedTs = updatedTs;
	}
	@Override
	public String toString() {
		return "UserRoleDetail [id=" + id + ", userDetail=" + userDetail + ", roles=" + roles + ", createTs=" + createTs
				+ ", updatedTs=" + updatedTs + "]";
	}
}
