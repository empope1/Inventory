package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Inventory;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Mar 5, 2024
 */

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}
