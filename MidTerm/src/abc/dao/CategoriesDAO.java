package abc.dao;

import abc.bean.Categories;
import java.util.*;

public interface  CategoriesDAO {
//r
Categories findCategoryById(int id);
List<Categories> listAllCategories();
//c
boolean createCategory(Categories category);
//u
boolean updateCategory(Categories category);
//d
boolean deleCategoryById(int id);
}
