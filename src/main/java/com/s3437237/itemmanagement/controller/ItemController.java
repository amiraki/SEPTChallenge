package com.s3437237.itemmanagement.controller;

import com.s3437237.itemmanagement.model.Item;
import com.s3437237.itemmanagement.model.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("")
    public String viewHomePage() {
        return "Welcome to Item Management - project by John Brown [ s3437237 ]";
    }

    // create a new item
    @PostMapping("/item")
    public String addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    // Get specific item by id
    @GetMapping("/item/item/{id}")
    public Item getItem(@PathVariable int id) {
        return itemService.getItem(id);
    }

    // Get all items
    @RequestMapping(value = "/item/item", method = RequestMethod.GET)
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    // Update item
    @RequestMapping(value = "/item/item", method = RequestMethod.PUT)
    public String updateItem(@RequestBody Item item) {
        return itemService.updateItem(item);
    }

    // Delete item
    @RequestMapping(value = "/item/item", method = RequestMethod.DELETE)
    public String deleteItem(@RequestBody Item item) {
        return itemService.deleteItem(item.getId());
    }

}
