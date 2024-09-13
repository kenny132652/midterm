package abc.dao;

import abc.bean.Categories;
import abc.dao.impl.CategoriesDAOImpl;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        CategoriesDAO categoriesDAO = new CategoriesDAOImpl();
        
        //findCategoryById
        // Categories categories = categoriesDAO.findCategoryById(1);
        // System.out.format("%-15s |%-15s |%-15s\n","CategoryID","CategoryName","Description");
        // System.out.format("%-15d |%-15s |%-50s", categories.getCategoryID(),categories.getCategoryName(),categories.getDescription());
        
        //listAllCategories
        List<Categories> allCategories = categoriesDAO.listAllCategories();
        System.out.format("|%-15s |%-15s |%-15s\n","CategoryID","CategoryName","Description");
        for (Categories categories : allCategories) {
            System.out.format("|%-15d |%-15s |%-50s\n", categories.getCategoryID(),categories.getCategoryName(),categories.getDescription());
        }
        
        //createCategory
        // Categories abc = new Categories();
        // abc.setCategoryName("Test2");
        // boolean bool = categoriesDAO.createCategory(abc);
        // System.out.println(bool?"ok":"fail");

        //update
        // Categories abc = new Categories();
        // abc.setCategoryName("update");
        // abc.setDescription("updatetest");
        // abc.setCategoryID(0);
        // boolean bool = categoriesDAO.updateCategory(abc);
        // System.out.println(bool?"ok":"fail");

        //delete
        //boolean bool = categoriesDAO.deleCategoryById(9);



    }
}
