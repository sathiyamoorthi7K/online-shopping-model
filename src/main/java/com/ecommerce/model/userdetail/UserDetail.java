package com.ecommerce.model.userdetail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.ecommerce.model.constants.CollectionName;
import com.ecommerce.model.roledetail.RoleDetail;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection=CollectionName.USER_DETAIL)
public class UserDetail {
	
	@Id
	@JsonIgnore
	private String id;
	
	@Field(name="userId")
	@Indexed(unique=true)
	@Size(min=6, message="User ID should be minimum 6 characters")
	private String userId;
	
	@Size(min=8, message="Password should be minimum 8 characters")
	//@JsonIgnore
	private String password;
	private String firstName;
	private String lastName;
	
	@Pattern(regexp="^(.+)@(.+)$")
	private String email;
	@Past
	private Date dob;
	
	
	@CreatedDate
	private Date createdTs;
	
	@LastModifiedDate
	private Date updatedTs;
	
	@DBRef
	private List<RoleDetail> roleDetails = new ArrayList<RoleDetail>();
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<RoleDetail> getRoleDetails() {
		return roleDetails;
	}
	public void setRoleDetails(List<RoleDetail> roleDetails) {
		this.roleDetails = roleDetails;
	}
	public UserDetail(String id, @Size(min = 6, message = "User ID should be minimum 6 characters") String userId,
			@Size(min = 8, message = "Password should be minimum 8 characters") String password, String firstName,
			String lastName, @Pattern(regexp = "^(.+)@(.+)$") String email, @Past Date dob, Date createdTs,
			Date updatedTs) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		this.createdTs = createdTs;
		this.updatedTs = updatedTs;
	}
	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", userId=" + userId + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", createdTs=" + createdTs + ", updatedTs=" + updatedTs + "]";
	}
	
}
