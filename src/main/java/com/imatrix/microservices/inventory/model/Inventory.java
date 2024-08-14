package com.imatrix.microservices.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 * Project : InventoryService
 * Class : {@link Inventory}
 *
 * @author : iMatrixLabs
 */
@Entity
@Table( name = "t_inventory" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String skuCode;
    private Integer quantity;
}
