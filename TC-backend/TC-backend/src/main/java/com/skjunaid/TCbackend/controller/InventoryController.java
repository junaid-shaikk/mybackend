package com.skjunaid.TCbackend.controller;

import com.skjunaid.TCbackend.model.Inventory;
import com.skjunaid.TCbackend.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/inventory")
    public Inventory saveInventory(@RequestBody Inventory inventory){
        return inventoryService.saveInventory(inventory);
    }

    @GetMapping("/inventory")
    public List<Inventory> fetchInventoryList(){
        return inventoryService.fetchInventoryList();
    }

    @DeleteMapping("/inventory")
    public String deleteById(@RequestParam("id") Long inventoryId){
        inventoryService.deleteById(inventoryId);
        return "Deleted";
    }

//    @PutMapping("/inventory")
//    public Inventory updateInventory(@RequestBody Inventory inventory){
//        return inventoryService.updateInventory(inventory);
//    }

    @PutMapping("/inventory/{id}")
    public ResponseEntity<Inventory> updateInventory(@PathVariable("id") Long inventoryId,
                                                     @RequestBody Inventory updatedInventory) {
        try {
            Inventory inventory = inventoryService.getById(inventoryId);
            if (inventory == null) {
                return ResponseEntity.notFound().build();
            }

            inventory.setName(updatedInventory.getName());
            inventory.setQuantity(updatedInventory.getQuantity());
            inventory.setCategory(updatedInventory.getCategory());
            inventory.setPrice(updatedInventory.getPrice());
            inventory.setSupplier(updatedInventory.getSupplier());

            Inventory savedInventory = inventoryService.updateInventory(inventory);
            return ResponseEntity.ok(savedInventory);
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
