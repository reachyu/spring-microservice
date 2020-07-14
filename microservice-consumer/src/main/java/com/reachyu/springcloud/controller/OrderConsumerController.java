package com.reachyu.springcloud.controller;

import java.util.List;

import com.reachyu.springcloud.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author reachyu
 */
@RestController
public class OrderConsumerController {

    private static String REST_URL_PREFIX = "http://localhost:8002";
    /*直接根据微服务名调用，而不再是根据地址和端口了，运用了eureka的发现功能*/
   // private static String REST_URL_PREFIX = "http://microservicecloud-provider";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/cs/order/add")
    public boolean addOrder(Order order){
        Boolean flag = restTemplate.postForObject(REST_URL_PREFIX + "/order/add", order, Boolean.class);
        return flag;
    }

    @RequestMapping(value="/cs/order/info/{id}")
    public Order get(@PathVariable("id") int id){
        Order order = restTemplate.getForObject(REST_URL_PREFIX + "/order/info" + "/id", Order.class);
        return order;
    }

    @RequestMapping(value="/cs/order/list")
    public List<Order> getList(){
        List list = restTemplate.getForObject(REST_URL_PREFIX + "/order/list", List.class);
        return list;
    }

}
