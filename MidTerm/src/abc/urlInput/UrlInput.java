package abc.urlInput;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;

import com.opencsv.*;
import com.opencsv.bean.CsvToBeanBuilder;

import abc.bean.Liquor;

public class UrlInput {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.ttl.com.tw/files/opendata/all/臺灣菸酒股份有限公司產品價目表.csv");
            InputStream openStream = url.openStream();
            InputStreamReader isr = new InputStreamReader(openStream,Charset.forName("big5"));
            BufferedReader br = new BufferedReader(isr);
            CSVReader reader = new CSVReaderBuilder(isr).build();

            // FileReader fr = new FileReader("C:/Users/User/Desktop/code/midtermreport/MidTerm/臺灣菸酒股份有限公司產品價目表 .csv",Charset.forName("big5"));
            // CSVReader reader2 = new CSVReaderBuilder(fr).build();
            // List<String[]> myEntries = reader2.readAll();
            // List<LiquorBean> beans = new CsvToBeanBuilder(fr).withType(LiquorBean.class).build().parse();
            
            
            // System.out.println(Arrays.toString(beans.toArray()));

            String [] nextline;
            while((nextline = reader.readNext())!= null){
                for(String string : nextline){
                    System.out.println(string);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
