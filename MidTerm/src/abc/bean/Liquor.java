package abc.bean;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class Liquor {
    @CsvBindByPosition(position = 0)
    private String 產品類別;
    @CsvBindByPosition(position = 1)
    private String 產品代號;
    @CsvBindByPosition(position = 2)
    private String 品名;
    @CsvBindByPosition(position = 3)
    private String 包裝;
    @CsvBindByPosition(position = 4)
    private String 單位;
    @CsvBindByPosition(position = 5)
    private String 建議售價;
    @CsvBindByPosition(position = 6)
    private String 備註;



    public String get產品類別() {
        return this.產品類別;
    }

    public void set產品類別(String 產品類別) {
        this.產品類別 = 產品類別;
    }

    public String get產品代號() {
        return this.產品代號;
    }

    public void set產品代號(String 產品代號) {
        this.產品代號 = 產品代號;
    }

    public String get品名() {
        return this.品名;
    }

    public void set品名(String 品名) {
        this.品名 = 品名;
    }

    public String get包裝() {
        return this.包裝;
    }

    public void set包裝(String 包裝) {
        this.包裝 = 包裝;
    }

    public String get單位() {
        return this.單位;
    }

    public void set單位(String 單位) {
        this.單位 = 單位;
    }

    public String get建議售價() {
        return this.建議售價;
    }

    public void set建議售價(String 建議售價) {
        this.建議售價 = 建議售價;
    }

    public String get備註() {
        return this.備註;
    }

    public void set備註(String 備註) {
        this.備註 = 備註;
    }

    @Override
    public String toString() {
        return "{" +
            " 產品類別='" + get產品類別() + "'" +
            ", 產品代號='" + get產品代號() + "'" +
            ", 品名='" + get品名() + "'" +
            ", 包裝='" + get包裝() + "'" +
            ", 單位='" + get單位() + "'" +
            ", 建議售價='" + get建議售價() + "'" +
            ", 備註='" + get備註() + "'" +
            "}";
    }

}