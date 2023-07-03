package com.example.prashansa.controller;

import com.example.prashansa.dto.AdminDataDto;
import com.example.prashansa.entity.OrderDetail;
import com.example.prashansa.entity.OrderInput;
import com.example.prashansa.service.AdminService;
import com.example.prashansa.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminDataController {

    @Autowired
    private AdminService adminService;


    @PreAuthorize("hasRole('Admin')")
    @GetMapping({"/getAdminData"})
    public AdminDataDto getAdminData(){
       return adminService.getAdminData();
    }
}
