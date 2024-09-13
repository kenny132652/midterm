package abc.bean;

import java.math.BigDecimal;


public class Products {
    private int ProductID;
    private String ProductName;
    private int SupplierID;
    private int CategoryID;
    private String QuantityPerUnit;
    private BigDecimal UnitPrice;
    private int UnitsInStock;
    private int UnitsOnOrder;
    private int ReorderLevel;
    private boolean Discontinued;

    public Products() {
    }

    public int getProductID() {
        return this.ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return this.ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getSupplierID() {
        return this.SupplierID;
    }

    public void setSupplierID(int SupplierID) {
        this.SupplierID = SupplierID;
    }

    public int getCategoryID() {
        return this.CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getQuantityPerUnit() {
        return this.QuantityPerUnit;
    }

    public void setQuantityPerUnit(String QuantityPerUnit) {
        this.QuantityPerUnit = QuantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return this.UnitPrice;
    }

    public void setUnitPrice(BigDecimal UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getUnitsInStock() {
        return this.UnitsInStock;
    }

    public void setUnitsInStock(int UnitsInStock) {
        this.UnitsInStock = UnitsInStock;
    }

    public int getUnitsOnOrder() {
        return this.UnitsOnOrder;
    }

    public void setUnitsOnOrder(int UnitsOnOrder) {
        this.UnitsOnOrder = UnitsOnOrder;
    }

    public int getReorderLevel() {
        return this.ReorderLevel;
    }

    public void setReorderLevel(int ReorderLevel) {
        this.ReorderLevel = ReorderLevel;
    }

    public boolean isDiscontinued() {
        return this.Discontinued;
    }

    public boolean getDiscontinued() {
        return this.Discontinued;
    }

    public void setDiscontinued(boolean Discontinued) {
        this.Discontinued = Discontinued;
    }


}
