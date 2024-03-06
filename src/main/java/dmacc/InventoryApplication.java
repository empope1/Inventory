package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Inventory;
import dmacc.beans.Location;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.InventoryRepository;

@SpringBootApplication
public class InventoryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
		
	}
	
	@Autowired
	InventoryRepository repo;
	

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			
			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			
			Inventory c = appContext.getBean("inventory",Inventory.class);
			c.setSold(false);
			repo.save(c);
			
			Inventory d = new Inventory(6123738, "Without a trace", 1);
			Location a = new Location("Affordables","555 Maple","Story City",50248);
			d.setLocation(a);
			repo.save(d);
			
			List<Inventory> allInventory = repo.findAll();
			for(Inventory books: allInventory) {
				System.out.println(books.toString());
			
		}
		
		((AbstractApplicationContext) appContext).close();
	}
	


}
