package com.imatrix.microservices.inventory.controller;

import com.imatrix.microservices.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * Project : InventoryService
 * Class : {@link InventoryController}
 *
 * @author : iMatrixLabs
 */

@RestController
@RequestMapping( "/api/inventory" )
@RequiredArgsConstructor
public class InventoryController
{
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus( HttpStatus.OK )
    public boolean placeOrder( @RequestParam String skuCode, @RequestParam Integer quantity )
    {
        return inventoryService.isStock( skuCode, quantity );
    }
}
