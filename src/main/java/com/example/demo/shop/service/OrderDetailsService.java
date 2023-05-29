package com.example.demo.shop.service;

import com.example.demo.shop.OrderDetails;
import com.example.demo.shop.Orders;
import com.example.demo.shop.Product;
import com.example.demo.shop.repository.OrderDetailsRepository;
import com.example.demo.shop.repository.OrdersRepository;
import com.example.demo.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Service
public class OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private ProductRepository productRepository;

    public OrderDetails createorderdetals(OrderDetails orderDetails, @PathVariable String orderId, @PathVariable String productId) {
        orderDetails.setId(UUID.randomUUID().toString());
        Orders orders = ordersRepository.findById(orderId).orElseThrow();
        Product product = productRepository.findById(productId).orElseThrow();
        orderDetails.setOrders(orders);
        orderDetails.setProduct(product);
        return orderDetailsRepository.save(orderDetails);
    }

    public OrderDetails creatupdetecustomer(@RequestBody OrderDetails orderDetails, @PathVariable String id) {
        OrderDetails orderDetailsToUpdate = orderDetailsRepository.findById(id).orElseThrow();
        orderDetailsToUpdate.setQty(orderDetails.getQty());
        orderDetailsToUpdate.setPrice(orderDetails.getPrice());
        orderDetailsToUpdate.setSubtotal(orderDetails.getSubtotal());
        return orderDetailsRepository.save(orderDetailsToUpdate);
    }
}
