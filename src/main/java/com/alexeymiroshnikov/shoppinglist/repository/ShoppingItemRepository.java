package com.alexeymiroshnikov.shoppinglist.repository;

import com.alexeymiroshnikov.shoppinglist.persist.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {
}
