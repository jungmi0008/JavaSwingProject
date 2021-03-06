package org.cms.model;

public class ClientDTO {
	private String id;
	private String name;
	private String gender;
	private String phone;
	private String address;
	
	
	public ClientDTO(String id, String name, String gender, String phone, String address) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	public ClientDTO() {
	}
	
	public String getId()	 {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ClientDTO [id=" + id + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", address="
				+ address + "]";
	}
}
