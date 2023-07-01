package com.example.prashansa.dao;


import com.example.prashansa.entity.OrderDetail;
import com.example.prashansa.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail,Integer> {
    public List<OrderDetail> findByUser(User user);
}
