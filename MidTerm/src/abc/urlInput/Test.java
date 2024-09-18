package abc.urlInput;

import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

import abc.bean.Liquor;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

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

            


        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
