package abc.urlInput;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import com.opencsv.*;
import com.opencsv.bean.CsvToBeanBuilder;

import abc.bean.Liquor;
import abc.util.ConnUtil;
import java.beans.Statement;

public class UrlInput {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.ttl.com.tw/files/opendata/all/臺灣菸酒股份有限公司產品價目表.csv");
            InputStream openStream = url.openStream();
            InputStreamReader isr = new InputStreamReader(openStream,Charset.forName("big5"));
            BufferedReader br = new BufferedReader(isr);
            CSVReader reader = new CSVReader(br);
            reader.readNext();
            List<Liquor> liquors = new CsvToBeanBuilder(reader).withType(Liquor.class).build().parse();

  
            // for (Liquor lb : liquors) {
            //     System.out.println(lb.toString());
            // }
            
            try (Connection conn = ConnUtil.getconnection("TTL")){
                String sql0 = "drop table Liquor create table Liquor(產品類別 varchar(50),產品代號 varchar(50) primary key,品名 varchar(50),包裝 varchar(50),單位 varchar(50),建議售價 int,備註 varchar(50))";
                PreparedStatement pstmt = conn.prepareStatement(sql0);
                pstmt.execute();
            } catch (Exception e) {
                e.printStackTrace();
            }


            String sql = "use TTL insert into Liquor values(?,?,?,?,?,?,?)";
            try (Connection conn = ConnUtil.getconnection("TTL")){
                PreparedStatement pstmt = conn.prepareStatement(sql);
                
                int updatecount = 0;
                for (Liquor l : liquors) {
                    pstmt.setString(1, l.get產品類別());
                    pstmt.setString(2, l.get產品代號());
                    pstmt.setString(3, l.get品名());
                    pstmt.setString(4, l.get包裝());
                    pstmt.setString(5, l.get單位());
                    pstmt.setInt(6, l.get建議售價());
                    pstmt.setString(7, l.get備註());
                    pstmt.executeUpdate();
                    updatecount++;
                } 
                System.out.printf("已新增%d筆資料\n",updatecount);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
