package com.reachyu.springcloud.controller;

import com.reachyu.springcloud.service.OrderService;
import com.reachyu.springcloud.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @RequestMapping(value="/order/add", method=RequestMethod.POST)
    public boolean addOrder(@RequestBody Order order){
        boolean flag = service.addOrder(order);
        return flag;
    }

    @RequestMapping(value="/order/info/{id}", method=RequestMethod.GET)
    public Order getOrder(@PathVariable("id") String id){
        Order order = service.getOrder(id);
        return order;
    }

    @RequestMapping(value="/order/list", method=RequestMethod.GET)
    public List<Order> getOrders(){
        List<Order> orders = service.getOrders();
        return orders;
    }
}
