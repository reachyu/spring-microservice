package com.reachyu.springcloud.service;

import com.reachyu.springcloud.vo.Order;

import java.util.List;

/**
 * @author reachyu
 */
public interface OrderService {

    public boolean addOrder(Order order);

    public Order getOrder(String id);

    public List<Order> getOrders();
}
