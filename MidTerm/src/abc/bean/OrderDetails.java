package abc.bean;

import java.math.*;

public class OrderDetails {
    private int OrderID;
    private int ProductID;
    private BigDecimal UnitPrice;
    private int Quantity;
    private float Discount;


    public OrderDetails() {
    }

    public int getOrderID() {
        return this.OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public int getProductID() {
        return this.ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public BigDecimal getUnitPrice() {
        return this.UnitPrice;
    }

    public void setUnitPrice(BigDecimal UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getDiscount() {
        return this.Discount;
    }

    public void setDiscount(float Discount) {
        this.Discount = Discount;
    }

}
