package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;


/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Mar 5, 2024
 */

@Entity
@Table(name="inventory")
public class Inventory {
	@Id
	@GeneratedValue
	private long isbn;
	private String bookName;
	private int inventory;
	private boolean sold;
	@Autowired
	private Location location;
	
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}


	public Inventory(long isbn, String bookName, int inventory) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.inventory = inventory;
	}


	public Inventory(long isbn, String bookName, int inventory, boolean sold) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.inventory = inventory;
		this.sold = sold;
	}


	public Inventory(long isbn, String bookName, int inventory, boolean sold, Location location) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.inventory = inventory;
		this.sold = sold;
		this.location = location;
	}


	/**
	 * @param string
	 */
	public Inventory(String string) {
		// TODO Auto-generated constructor stub
	}


	public long getIsbn() {
		return isbn;
	}


	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getInventory() {
		return inventory;
	}


	public void setInventory(int inventory) {
		this.inventory = inventory;
	}


	public boolean isSold() {
		return sold;
	}


	public void setSold(boolean sold) {
		this.sold = sold;
	}


	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Inventory [isbn=" + isbn + ", bookName=" + bookName + ", inventory=" + inventory + ", sold=" + sold
				+ "]";
	}
	
	

}
