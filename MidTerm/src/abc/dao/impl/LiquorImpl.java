package abc.dao.impl;

import abc.bean.Liquor;
import abc.dao.LiquorDAO;
import abc.util.ConnUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;

import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class LiquorImpl implements LiquorDAO{

    @Override
    public Liquor findItemById(String id) {
        String sql = "select * from Liquor where 產品代號 = ?";
        try (Connection conn = ConnUtil.getconnection("TTL")){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            Liquor liquor = new Liquor();
            liquor.set產品類別(rs.getString("產品類別"));
            liquor.set產品代號(rs.getString("產品代號"));
            liquor.set品名(rs.getString("品名"));
            liquor.set包裝(rs.getString("包裝"));
            liquor.set單位(rs.getString("單位"));
            liquor.set建議售價(rs.getInt("建議售價"));
            liquor.set備註(rs.getString("備註"));
            return liquor;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Liquor> findAllItem() {
        String sql="select * from Liquor order by 產品類別 desc";
        List<Liquor> list = new ArrayList<>();
        try (Connection conn = ConnUtil.getconnection("TTL")){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) { 
                Liquor liquor = new Liquor();
                liquor.set產品類別(rs.getString("產品類別"));
                liquor.set產品代號(rs.getString("產品代號"));
                liquor.set品名(rs.getString("品名"));
                liquor.set包裝(rs.getString("包裝"));
                liquor.set單位(rs.getString("單位"));
                liquor.set建議售價(rs.getInt("建議售價"));
                liquor.set備註(rs.getString("備註"));
                list.add(liquor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Liquor findItemByName(String name) {
        String sql = "select * from Liquor where 品名 = ?";
        try (Connection conn = ConnUtil.getconnection("TTL")){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            Liquor liquor = new Liquor();
            liquor.set產品類別(rs.getString("產品類別"));
            liquor.set產品代號(rs.getString("產品代號"));
            liquor.set品名(rs.getString("品名"));
            liquor.set包裝(rs.getString("包裝"));
            liquor.set單位(rs.getString("單位"));
            liquor.set建議售價(rs.getInt("建議售價"));
            liquor.set備註(rs.getString("備註"));
            return liquor;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean createItem(Liquor newItem) {
        String sql = "insert into Liquor values(?,?,?,?,?,?,?)";
        try (Connection conn = ConnUtil.getconnection("TTL")){
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, newItem.get產品類別());
            pstmt.setString(2, newItem.get產品代號());
            pstmt.setString(3, newItem.get品名());
            pstmt.setString(4, newItem.get包裝());
            pstmt.setString(5, newItem.get單位());
            pstmt.setInt(6, newItem.get建議售價());
            pstmt.setString(7, newItem.get備註());
            int updatecount=pstmt.executeUpdate();
            System.out.printf("已新增%d筆資料\n",updatecount);
            if(updatecount>0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateItem(Liquor udItem) {
        String sql = "update Liquor set 產品類別 = ?,品名 = ? ,包裝 = ?, 單位 = ?,建議售價 = ?,備註 = ? where 產品代號 = ?";
        try (Connection conn = ConnUtil.getconnection("TTL")){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, udItem.get產品類別());
            pstmt.setString(7, udItem.get產品代號());
            pstmt.setString(2, udItem.get品名());
            pstmt.setString(3, udItem.get包裝());
            pstmt.setString(4, udItem.get單位());
            pstmt.setInt(5, udItem.get建議售價());
            pstmt.setString(6, udItem.get備註());
            int updatecount=pstmt.executeUpdate();
            System.out.printf("已修改%d筆資料\n",updatecount);
            if(updatecount>0) return true;            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleItem(String id) {
        String sql = "delete from Liquor where 產品代號=? ";
        try (Connection conn = ConnUtil.getconnection("TTL")){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            int updatecount=pstmt.executeUpdate();
            System.out.printf("已刪除%d筆資料\n",updatecount);
            if(updatecount>0) return true;            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean outpotdatatable() {
        
        String sql = "select * from Liquor";
        try (Connection conn = ConnUtil.getconnection("TTL")){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            try {
                CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\User\\Desktop\\123.csv"));
                writer.writeAll(rs, true);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }



}
