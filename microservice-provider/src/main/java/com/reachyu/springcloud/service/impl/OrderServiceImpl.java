package com.reachyu.springcloud.service.impl;

import com.reachyu.springcloud.dao.OrderDao;
import com.reachyu.springcloud.service.OrderService;
import com.reachyu.springcloud.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author reachyu
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public boolean addOrder(Order order) {
        boolean flag;
        flag = orderDao.addOrder(order);
        return flag;
    }

    @Override
    public Order getOrder(String id) {
        Order user = orderDao.getOrder(id);
        return user;
    }

    @Override
    public List<Order> listOrder() {
        List<Order> orders = orderDao.listOrder();
        return orders;
    }
}
