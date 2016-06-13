package cn.fanstar.server.mapper;


import cn.fanstar.server.dto.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductMapper {

  List<Product> getProductListByCategory(String categoryId);

  Product getProduct(String productId);

  List<Product> searchProductList(String keywords);

}
