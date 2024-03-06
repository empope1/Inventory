package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Mar 5, 2024
 */

@Embeddable
public class Location {
	private String storeName;
	private String street;
	private String city;
	private int zipCode;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String storeName, String street, String city, int zipCode) {
		super();
		this.storeName = storeName;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Location [storeName=" + storeName + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode
				+ "]";
	}
	
	
	

}
