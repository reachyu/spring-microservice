package com.reachyu.springcloud.dao;

import com.reachyu.springcloud.vo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    public boolean addOrder(Order order);

    public Order getOrder(String id);

    public List<Order> getOrders();
}
