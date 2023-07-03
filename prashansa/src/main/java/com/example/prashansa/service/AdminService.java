package com.example.prashansa.service;

import com.example.prashansa.configuration.JwtRequestFilter;
import com.example.prashansa.dao.CartDao;
import com.example.prashansa.dao.OrderDetailDao;
import com.example.prashansa.dao.ProductDao;
import com.example.prashansa.dao.UserDao;
import com.example.prashansa.dto.AdminDataDto;
import com.example.prashansa.entity.Cart;
import com.example.prashansa.entity.Product;
import com.example.prashansa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminService {


    @Autowired
    private ProductDao productDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private OrderDetailDao orderDetailDao;


    public AdminDataDto getAdminData() {
        AdminDataDto dto = new AdminDataDto();

         dto.setCustomerCount(userDao.getCustomerCount());
         dto.setProductCount(productDao.count());
         dto.setOrderDeliveredCount(orderDetailDao.countByOrderStatus("Delivered"));
         dto.setOrdersPlacedCount(orderDetailDao.countByOrderStatus("Placed"));

        return dto;
    }
}
