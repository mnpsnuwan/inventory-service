package com.imatrix.microservices.inventory.repository;

import com.imatrix.microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : InventoryService
 * Class : {@link InventoryRepository}
 *
 * @author : iMatrixLabs
 */
public interface InventoryRepository extends JpaRepository<Inventory,Long>
{
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual( String skuCode, Integer quantity );
}
