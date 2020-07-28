package com.reachyu.springcloud.service;

import com.reachyu.springcloud.vo.Order;

import java.util.List;

/**
 * @author reachyu
 */
public interface OrderService {

    boolean addOrder(Order order);

    Order getOrder(String id);

    List<Order> listOrder();
}
