package com.example.prashansa.service;

import com.example.prashansa.configuration.JwtRequestFilter;
import com.example.prashansa.dao.CartDao;
import com.example.prashansa.dao.ProductDao;
import com.example.prashansa.dao.UserDao;
import com.example.prashansa.entity.Cart;
import com.example.prashansa.entity.Product;
import com.example.prashansa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartService {

    @Autowired
    private CartDao cartDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private UserDao userDao;

    public Cart addToCart(Integer productId){
        Product product = productDao.findById(productId).get();
        String username = JwtRequestFilter.CURRENT_USER;
        User user = null;
        if (username != null){
            user = userDao.findById(username).get();
        }

        List<Cart> cartList = cartDao.findByUser(user);
        List<Cart> filteredList = cartList.stream().filter(x -> x.getProduct().getProductId() == productId).collect(Collectors.toList());

        if (filteredList.size()>0){
            return null;
        }

        if (product != null && user != null){
            Cart cart = new Cart(product,user);
            return cartDao.save(cart);
        }
        return null;
    }
    public List<Cart> getCartDetails(){
        String username = JwtRequestFilter.CURRENT_USER;
        User user = userDao.findById(username).get();
        return cartDao.findByUser(user);
    }
}
