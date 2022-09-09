package com.s3437237.itemmanagement.dao;

import com.s3437237.itemmanagement.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDAO extends JpaRepository<Item, Integer> {

}
