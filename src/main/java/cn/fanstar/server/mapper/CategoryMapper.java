package cn.fanstar.server.mapper;


import cn.fanstar.server.dto.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryMapper {

  List<Category> getCategoryList();

  Category getCategory(String categoryId);

}
