package cn.fanstar.server.mapper;


import cn.fanstar.server.dto.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderMapper {

  List<Order> getOrdersByUsername(String username);

  Order getOrder(int orderId);
  
  void insertOrder(Order order);
  
  void insertOrderStatus(Order order);

}
