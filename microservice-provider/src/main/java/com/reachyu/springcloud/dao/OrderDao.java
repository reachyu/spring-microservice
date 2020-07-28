package com.reachyu.springcloud.dao;

import com.reachyu.springcloud.vo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author reachyu
 */
@Mapper
public interface OrderDao {
    boolean addOrder(Order order);

    Order getOrder(String id);

    List<Order> listOrder();
}
