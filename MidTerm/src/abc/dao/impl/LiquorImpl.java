package abc.dao.impl;

import abc.bean.Liquor;
import abc.dao.LiquorDAO;
import abc.util.ConnUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class LiquorImpl implements LiquorDAO{

    @Override
    public boolean createTable(Liquor liquor) {
        // TODO Auto-generated method stub
        String sql = "create table 臺灣菸酒股份有限公司產品價目表";
        try (Connection conn = ConnUtil.getconnection("TTL")){
            String sql2="i";
            PreparedStatement pstmt = conn.prepareStatement(sql);



        } catch (Exception e) {
            e.printStackTrace();
        }
        

        throw new UnsupportedOperationException("Unimplemented method 'createTable'");
    }

}
