package abc.dao.impl;

import abc.bean.Categories;
import abc.dao.CategoriesDAO;
import abc.util.ConnUtil;
import java.sql.*;
import java.util.*;


public class CategoriesDAOImpl implements CategoriesDAO {

    @Override
    public Categories findCategoryById(int id) {
        
        String sql="select * from Categories where CategoryID = ?";
        try (Connection conn = ConnUtil.getconnection()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            Categories category = new Categories();
            category.setCategoryID(rs.getInt("CategoryID"));        
            category.setCategoryName(rs.getString("CategoryName"));
            category.setDescription(rs.getString("Description"));
            category.setPicture(rs.getBytes("Picture"));
            return category;    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

       
    }

    @Override
    public List<Categories> listAllCategories() {
        
        String sql="select * from Categories";
        List<Categories> list = new ArrayList<>();
        try (Connection conn = ConnUtil.getconnection()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) { 
                Categories category = new Categories();
                category.setCategoryID(rs.getInt("CategoryID"));        
                category.setCategoryName(rs.getString("CategoryName"));
                category.setDescription(rs.getString("Description"));
                category.setPicture(rs.getBytes("Picture"));
                list.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean createCategory(Categories category) {
        String sql ="insert into Categories(CategoryName,Description) values(?,?) ";                  
        try (Connection conn = ConnUtil.getconnection()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //pstmt.setInt(1, category.getCategoryID());
            pstmt.setString(1, category.getCategoryName());
            pstmt.setString(2, category.getDescription());
            int updatecount=pstmt.executeUpdate();
            System.out.printf("已新增%d筆資料\n",updatecount);
            if(updatecount>0) return true;           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean updateCategory(Categories category) {
        String sql = "update Categories set CategoryName= ?,Description = ? where CategoryID = ?";
        try (Connection conn = ConnUtil.getconnection()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,category.getCategoryName());
            pstmt.setString(2,category.getDescription());
            pstmt.setInt(3,category.getCategoryID());
            int updatecount=pstmt.executeUpdate();
            System.out.printf("已修改%d筆資料\n",updatecount);
            if(updatecount>0) return true;            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleCategoryById(int id) {
        String sql = "delete from Categories where CategoryID = ?";
        try (Connection conn = ConnUtil.getconnection()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            int updatecount = pstmt.executeUpdate();
            System.out.printf("已刪除%d筆資料\n",updatecount);
            if(updatecount>0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;


    }
    
}
// try (Connection conn = ConnUtil.getconnection()){
            
// } catch (SQLException e) {
//     e.printStackTrace();
// }