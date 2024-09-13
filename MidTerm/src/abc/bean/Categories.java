package abc.bean;

public class Categories {
    private int CategoryID;
    private String CategoryName;
    private String Description;
    private byte[] Picture;

    public Categories(){

    }

    public int getCategoryID() {
        return this.CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getCategoryName() {
        return this.CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public byte[] getPicture() {
        return this.Picture;
    }

    public void setPicture(byte[] Picture) {
        this.Picture = Picture;
    }

}
