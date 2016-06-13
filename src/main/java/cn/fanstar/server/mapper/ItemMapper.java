package cn.fanstar.server.mapper;


import cn.fanstar.server.dto.Item;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface ItemMapper {

  void updateInventoryQuantity(Map<String, Object> param);

  int getInventoryQuantity(String itemId);

  List<Item> getItemListByProduct(String productId);

  Item getItem(String itemId);

}
