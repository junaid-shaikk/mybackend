package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Inventory;
import com.skjunaid.TCbackend.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class InventoryServiceImpl implements InventoryService{

    @Autowired
    private InventoryRepository inventoryRepository;
    @Override
    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public List<Inventory> fetchInventoryList() {
        return inventoryRepository.findAll();
    }

    @Override
    public void deleteById(Long inventoryId) {
        inventoryRepository.deleteById(inventoryId);
    }

//    @Override
//    public Inventory updateInventory(Inventory inventory) {
//        return inventoryRepository.save(inventory);
//    }

//    @Override
//    public Inventory updateInventory(Inventory updatedInventory) {
//        try {
//            Inventory inventory = inventoryRepository.findById(updatedInventory.getId())
//                    .orElseThrow(() -> new NoSuchElementException("Inventory not found"));
//
//            inventory.setName(updatedInventory.getName());
//            inventory.setQuantity(updatedInventory.getQuantity());
//            inventory.setCategory(updatedInventory.getCategory());
//            inventory.setPrice(updatedInventory.getPrice());
//            inventory.setSupplier(updatedInventory.getSupplier());
//
//            return inventoryRepository.save(inventory);
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException("Inventory not found");
//        }
//    }
//
//    @Override
//    public Inventory getById(Long id) {
//        return inventoryRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Inventory not found"));
//    }

    @Override
    public Inventory updateInventory(Inventory updatedInventory) {
        try {
            Inventory inventory = inventoryRepository.findById(updatedInventory.getId())
                    .orElseThrow(() -> new NoSuchElementException("Inventory not found"));

            inventory.setName(updatedInventory.getName());
            inventory.setQuantity(updatedInventory.getQuantity());
            inventory.setCategory(updatedInventory.getCategory());
            inventory.setPrice(updatedInventory.getPrice());
            inventory.setSupplier(updatedInventory.getSupplier());

            return inventoryRepository.save(inventory);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Inventory not found");
        }
    }

    @Override
    public Inventory getById(Long id) {
        return inventoryRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Inventory not found"));
    }


}
