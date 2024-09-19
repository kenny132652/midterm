package abc.dao;

import abc.bean.Liquor;
import java.util.List;


public interface  LiquorDAO {
    //r
    Liquor findItemById(String id);
    List<Liquor> findAllItem();
    Liquor findItemByName(String name);
    //c
    boolean createItem(Liquor newItem);
    //u
    boolean updateItem(Liquor udItem);
    //d
    boolean deleItem(String id);
    //輸出csv
    boolean outpotdatatable();
}
