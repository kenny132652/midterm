package abc.bean;

import java.sql.*;

public class Employees {
    private int EmployeeID;
    private String LastName;
    private String FirstName;
    private String Title;
    private String TitleOfCourtesy;
    private Date BirthDate;
    private Date HireDate;
    private String Address;
    private String City;
    private String Region;
    private String PostalCode;
    private String Country;
    private String HomePhone;
    private String Extension;
    private byte[] Photo;
    private String Notes;
    private int ReportsTo;
    private String PhotoPath;


    public Employees() {
    }
    

    public int getEmployeeID() {
        return this.EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getTitleOfCourtesy() {
        return this.TitleOfCourtesy;
    }

    public void setTitleOfCourtesy(String TitleOfCourtesy) {
        this.TitleOfCourtesy = TitleOfCourtesy;
    }

    public Date getBirthDate() {
        return this.BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public Date getHireDate() {
        return this.HireDate;
    }

    public void setHireDate(Date HireDate) {
        this.HireDate = HireDate;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return this.City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getRegion() {
        return this.Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getPostalCode() {
        return this.PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getHomePhone() {
        return this.HomePhone;
    }

    public void setHomePhone(String HomePhone) {
        this.HomePhone = HomePhone;
    }

    public String getExtension() {
        return this.Extension;
    }

    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public byte[] getPhoto() {
        return this.Photo;
    }

    public void setPhoto(byte[] Photo) {
        this.Photo = Photo;
    }

    public String getNotes() {
        return this.Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public int getReportsTo() {
        return this.ReportsTo;
    }

    public void setReportsTo(int ReportsTo) {
        this.ReportsTo = ReportsTo;
    }

    public String getPhotoPath() {
        return this.PhotoPath;
    }

    public void setPhotoPath(String PhotoPath) {
        this.PhotoPath = PhotoPath;
    }

}
