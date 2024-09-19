package abc.dao;

import abc.bean.Liquor;
import abc.dao.impl.LiquorImpl;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        LiquorDAO liquorDAO = new LiquorImpl();

        // //findItemById
        // Liquor liquor = liquorDAO.findItemById("211070");
        // System.out.format("|%-5s |%-10s |%-20s |%-10s |%-2s |%-10s |%-50s |\n","產品類別","產品代號","品名","包裝","單位","建議售價","備註");
        // System.out.println(liquor.toString());

        //listallitem
        List<Liquor> allLiquors = liquorDAO.findAllItem();
        for (Liquor l  : allLiquors) {
            System.out.println(l.toString());
        }

        // //findItemByName
        // Liquor liquor = liquorDAO.findItemByName("玉山琴酒");
        // System.out.println(liquor.toString());
        
        // //create
        // Liquor a = new Liquor();
        // a.set品名("TEST");
        // a.set產品代號("1");
        // boolean bool = liquorDAO.createItem(a);
        // System.out.println(bool?"ok":"fail");

        // //update
        // Liquor a = new Liquor();
        // a.set品名("TEST123");
        // a.set產品代號("1");
        // boolean bool = liquorDAO.updateItem(a);
        // System.out.println(bool?"ok":"fail");

        // //delete
        // boolean bool = liquorDAO.deleItem("1");

        // //輸出資料表
        // boolean bool = liquorDAO.outpotdatatable();


    }
}
