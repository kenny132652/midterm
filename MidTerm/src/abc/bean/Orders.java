package abc.bean;

import java.math.BigDecimal;
import java.sql.*;

public class Orders {

    private int OrderID;
    private String CustomerID;
    private int EmployeeID;
    private Date OrderDate;
    private Date RequiredDate;
    private Date ShippedDate;
    private int ShipVia;
    private BigDecimal Freight;
    private String ShipName;
    private String ShipAddress;
    private String ShipCity;
    private String ShipRegion;
    private String ShipPostalCode;
    private String ShipCountry;

    public Orders() {
    }

    public int getOrderID() {
        return this.OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getCustomerID() {
        return this.CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getEmployeeID() {
        return this.EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public Date getOrderDate() {
        return this.OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Date getRequiredDate() {
        return this.RequiredDate;
    }

    public void setRequiredDate(Date RequiredDate) {
        this.RequiredDate = RequiredDate;
    }

    public Date getShippedDate() {
        return this.ShippedDate;
    }

    public void setShippedDate(Date ShippedDate) {
        this.ShippedDate = ShippedDate;
    }

    public int getShipVia() {
        return this.ShipVia;
    }

    public void setShipVia(int ShipVia) {
        this.ShipVia = ShipVia;
    }

    public BigDecimal getFreight() {
        return this.Freight;
    }

    public void setFreight(BigDecimal Freight) {
        this.Freight = Freight;
    }

    public String getShipName() {
        return this.ShipName;
    }

    public void setShipName(String ShipName) {
        this.ShipName = ShipName;
    }

    public String getShipAddress() {
        return this.ShipAddress;
    }

    public void setShipAddress(String ShipAddress) {
        this.ShipAddress = ShipAddress;
    }

    public String getShipCity() {
        return this.ShipCity;
    }

    public void setShipCity(String ShipCity) {
        this.ShipCity = ShipCity;
    }

    public String getShipRegion() {
        return this.ShipRegion;
    }

    public void setShipRegion(String ShipRegion) {
        this.ShipRegion = ShipRegion;
    }

    public String getShipPostalCode() {
        return this.ShipPostalCode;
    }

    public void setShipPostalCode(String ShipPostalCode) {
        this.ShipPostalCode = ShipPostalCode;
    }

    public String getShipCountry() {
        return this.ShipCountry;
    }

    public void setShipCountry(String ShipCountry) {
        this.ShipCountry = ShipCountry;
    }
    


}
