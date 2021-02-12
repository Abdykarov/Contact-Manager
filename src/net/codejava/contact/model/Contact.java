/**
 * 
 */
package net.codejava.contact.model;

/**
 * @author abdykili
 *
 */
public class Contact {
	private Integer id;
	private String name;
	private String email;
	private String address;
	private String phone; 
	protected Contact(Integer id, String name, String email, String address, String phone) {
		super();
		this.id = id;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
