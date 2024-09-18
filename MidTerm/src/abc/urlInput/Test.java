package abc.urlInput;

import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

import abc.bean.Liquor;
import abc.util.ConnUtil;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\code\\midtermreport\\MidTerm\\123.csv",Charset.forName("big5"));
            CSVReader csvReader = new CSVReader(fr);
            csvReader.readNext();
            List<Liquor> liquors = new CsvToBeanBuilder(csvReader).withType(Liquor.class).build().parse();

            //System.out.println(liquors.get(0));            
            // for (Liquor lb : liquors) {
            //     System.out.println(lb.toString());
            // }
            String sql = "insert into Liquor values(?,?,?,?,?,?,?)";
            try (Connection conn = ConnUtil.getconnection("TTL")){
                PreparedStatement pstmt = conn.prepareStatement(sql);
                for (Liquor l : liquors) {
                    pstmt.setString(1, l.get產品類別());
                    pstmt.setString(2, l.get產品代號());
                    pstmt.setString(3, l.get品名());
                    pstmt.setString(4, l.get包裝());
                    pstmt.setString(5, l.get單位());
                    pstmt.setString(6, l.get建議售價());
                    pstmt.setString(7, l.get備註());
                    int updatecount=pstmt.executeUpdate();
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
