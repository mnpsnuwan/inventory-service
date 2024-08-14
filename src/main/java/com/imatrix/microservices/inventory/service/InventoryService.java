package com.imatrix.microservices.inventory.service;

import com.imatrix.microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : InventoryService
 * Class : {@link InventoryService}
 *
 * @author : iMatrixLabs
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService
{
    private final InventoryRepository inventoryRepository;

    public boolean isInStock( String skuCode, Integer quantity )
    {
        // Find an inventory for a given skuCode where quantity >= 0
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual( skuCode, quantity );
    }
}
