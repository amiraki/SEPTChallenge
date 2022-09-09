package com.s3437237.itemmanagement.controller;

import com.s3437237.itemmanagement.model.Item;
import com.s3437237.itemmanagement.model.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("")
    public String viewHomePage() {
        return "Welcome to Item Management";
    }

    @PostMapping("/item")
    public String addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

}
