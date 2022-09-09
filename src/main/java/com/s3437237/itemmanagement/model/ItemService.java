package com.s3437237.itemmanagement.model;

import com.s3437237.itemmanagement.dao.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemDAO dao;

    // Add item
    public String addItem(Item item) {
        dao.save(item);
        return "New Item added, item Name :" +item.getName();
    }

    // Get item by id
    public Item getItem(int id) {
        return dao.findById(id).get();
    }

    // Get all items
    public List<Item> getAllItems() {
        List<Item> item = new ArrayList<>();
        dao.findAll().forEach(item1 -> item.add(item1));
        return item;
    }

    // Update item
    public String updateItem(Item item) {
        dao.save(item);
        return "Item Update Successful :" +item.getName();
    }

    // Delete item
    public String deleteItem(int id) {
        Item item = dao.getById(id);
        dao.delete(item);
        return "Item deleted successfully";
    }
}
