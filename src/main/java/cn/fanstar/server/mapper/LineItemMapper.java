package cn.fanstar.server.mapper;


import cn.fanstar.server.dto.LineItem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LineItemMapper {

  List<LineItem> getLineItemsByOrderId(int orderId);

  void insertLineItem(LineItem lineItem);

}
