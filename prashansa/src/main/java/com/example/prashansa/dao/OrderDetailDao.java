package com.example.prashansa.dao;


import com.example.prashansa.entity.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailDao extends CrudRepository<OrderDetail,Integer> {
}
