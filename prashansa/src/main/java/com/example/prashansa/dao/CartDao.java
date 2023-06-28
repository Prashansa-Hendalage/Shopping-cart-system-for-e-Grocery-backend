package com.example.prashansa.dao;

import com.example.prashansa.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer> {
}
