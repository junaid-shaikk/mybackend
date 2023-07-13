package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Inventory;

import java.util.List;

//public interface InventoryService {
//    public Inventory saveInventory(Inventory inventory);
//
//    public List<Inventory> fetchInventoryList();
//
//
//    public void deleteById(Long inventoryId);
//
//    public Inventory updateInventory(Inventory inventory);
//}

public interface InventoryService {
    Inventory saveInventory(Inventory inventory);

    List<Inventory> fetchInventoryList();

    void deleteById(Long inventoryId);

    // Inventory updateInventory(Inventory inventory);
    Inventory updateInventory(Inventory updatedInventory);


    Inventory getById(Long id);

}
