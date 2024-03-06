package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Inventory;
import dmacc.beans.Location;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Mar 5, 2024
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Inventory inventory() {
		Inventory bean = new Inventory("NonFiction");
		bean.setIsbn(32678291);
		bean.setBookName("Velocity");
		bean.setInventory(3);
		bean.setSold(false);
		return bean;
	}
	
	@Bean
	public Location location() {
		Location bean = new Location("Books ETC", "123 Main Street","Ankeny", 50029);
		return bean;
	}

}
