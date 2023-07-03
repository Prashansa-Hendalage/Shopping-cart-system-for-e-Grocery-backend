package com.example.prashansa.dao;

import com.example.prashansa.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,String> {
    @Query(value = "SELECT count(*) FROM user_role ur where ur.role_id ='User'", nativeQuery=true)
    long getCustomerCount();
}
