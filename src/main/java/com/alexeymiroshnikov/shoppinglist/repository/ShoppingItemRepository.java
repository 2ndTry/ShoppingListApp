package com.alexeymiroshnikov.shoppinglist.repository;

import com.alexeymiroshnikov.shoppinglist.persist.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {

    List<ShoppingItem> findByUserUsername(String username);
}
